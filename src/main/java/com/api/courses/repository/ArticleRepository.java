package com.api.courses.repository;

import com.api.courses.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.security.KeyStore;
import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer> {

    @Query("SELECT a FROM article a WHERE a.code = ?1")
    List<Article> findArticleByCode(String code);

    @Query("SELECT a FROM article a WHERE a.article = ?1")
    List<Article> findArticleByName(String article);

    @Query("SELECT a FROM article a WHERE a.prix = ?1")
    List<Article> findArticleByPrixUnitaire(Double pu);
}
