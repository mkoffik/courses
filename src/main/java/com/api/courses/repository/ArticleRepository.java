package com.api.courses.repository;

import com.api.courses.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ArticleRepository extends JpaRepository<Article,Integer> {
}
