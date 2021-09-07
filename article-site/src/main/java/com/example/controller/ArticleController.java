package com.example.controller;

import com.example.model.Article;
import com.example.model.Comment;
import com.example.model.Pressman;
import com.example.repository.ArticleRepo;
import com.example.repository.CommentsRepo;
import com.example.repository.SketchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepo articleRepo;
    
    @Autowired
    private SketchRepo sketchRepo;

    @Autowired
    private CommentsRepo commentsRepo;


    @GetMapping("/articleReadMore/{user}/{articleId}")
    public String getArticle(Model model, @PathVariable String user,@PathVariable Long articleId){



        Article searchArticle = articleRepo.findByUsernameAndId(user, articleId);

        if (searchArticle!=null){
            model.addAttribute("article",searchArticle);
        }else{
            model.addAttribute("message","Article Not found");
        }
        Article article = new Article();
        article.setId(articleId);
        List<Comment> comments = commentsRepo.findByArticle(article);
        if(comments!=null){
            model.addAttribute("comments",comments);
        }

        return  "viewArticle";
    }

    @PostMapping
    public String sendComment(@AuthenticationPrincipal Pressman pressman,
                            @RequestParam Long articleId,
                              @RequestParam String name,
                              @RequestParam String textComment,
                              Model model){
        Comment comment = new Comment();

        Article article = articleRepo.findTopById(articleId);
        comment.setArticle(article);
        comment.setAuthor(name);
        comment.setText(textComment);
        commentsRepo.save(comment);
        if(article.getComments().isEmpty()) {
            article.setComments(Collections.singletonList(comment));
            articleRepo.save(article);
        }else{
            article.getComments().add(comment);
        }
        model.addAttribute("article",article);


        return  String.format("redirect:/articleReadMore/%s/%s",name,articleId);
    }
}
