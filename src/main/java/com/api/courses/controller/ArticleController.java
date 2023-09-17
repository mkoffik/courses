package com.api.courses.controller;

import com.api.courses.model.Article;
import com.api.courses.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/courses")
public class ArticleController {

    private ArticleService articleService;

    @GetMapping
    public List<Article> findAll(){
        return  articleService.findAllArticles();
    }
}
