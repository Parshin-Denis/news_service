package com.example.NewsService.service;

import com.example.NewsService.model.Comment;
import com.example.NewsService.model.News;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();

    List<Comment> findAllByNews(long newsId);

    Comment findById(long id);

    Comment save(Comment comment);

    Comment update(Comment comment);

    void deleteById(long id);
}
