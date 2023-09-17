package com.api.courses.service;

import com.api.courses.model.Article;
import com.api.courses.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements ArticleServiceI {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<Article> addNewArticle(Article article) throws Exception {
        if(articleRepository.findAll().stream().filter(a -> a.getCode().equals(article.getCode())).findFirst().isEmpty()){
            throw new Exception(" cet atricle : "+ article.toString() + " existe deja ");
        }
        articleRepository.save(article);
        return articleRepository.findAll();
    }

    @Override
    public List<Article> findAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> findArticleByCode(String code) {
        return articleRepository.findArticleByCode(code);
    }

    @Override
    public List<Article> findArticleByName(String article) {
        return articleRepository.findArticleByName(article);
    }

    @Override
    public List<Article> findArticleByPrixUnitaire(Double pu) {
        return articleRepository.findArticleByPrixUnitaire(pu);
    }

}
