package com.api.courses.service;

import com.api.courses.model.Article;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleServiceI {

    List<Article> addNewArticle(Article article) throws Exception;
    List<Article> findAllArticles();
    List<Article> findArticleByCode(String code);

    List<Article> findArticleByName(String article);

    List<Article> findArticleByPrixUnitaire(Double pu);
}
