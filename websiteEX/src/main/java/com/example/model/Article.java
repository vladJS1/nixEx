package com.example.model;

import org.hibernate.annotations.Type;
import org.hibernate.type.descriptor.sql.LongVarcharTypeDescriptor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Sketch sketch;

    @OneToOne
    @JoinColumn(name="status_bar_id")
    StatusBar statusBar;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy="article")
    private List<Comment> comments;

    @OneToMany(mappedBy = "article")
    Set<Like> likes;

    @OneToMany

    @Type(type= "text")
    private String text;

    @OneToOne(cascade = CascadeType.MERGE)
    private StatusBar statusBar;

    public Set<Like> getLikes() {
        return likes;
    }

    public void setLikes(Set<Like> likes) {
        this.likes = likes;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Sketch getSketch() {
        return sketch;
    }

    public void setSketch(Sketch sketch) {
        this.sketch = sketch;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(Pressman author) {
        this.username = author!=null?author.getUsername():null;
    }

    public Article() {
    }

    public Article( String text, StatusBar statusBar,Pressman author) {
        this.text = text;
        this.statusBar = statusBar;
        this.username=author!=null?author.getUsername():null;
    }

    public StatusBar getStatusBar() {
        return statusBar;
    }

    public void setStatusBar(StatusBar statusBar) {
        this.statusBar = statusBar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
