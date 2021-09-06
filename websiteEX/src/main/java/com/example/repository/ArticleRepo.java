package com.example.repository;

import com.example.model.Article;
import com.example.model.Pressman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepo extends JpaRepository<Article,Long> {
    public Article findByUsernameAndId(String author, Long id);



    public Article findTopById(Long articleId);
}
