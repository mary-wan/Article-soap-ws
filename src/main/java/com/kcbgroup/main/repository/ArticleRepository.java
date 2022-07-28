package com.kcbgroup.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcbgroup.main.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long>  {
	Article findByArticleId(long articleId);
    List<Article> findByTitleAndCategory(String title, String category);
} 