package org.example.repository;

import org.example.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BlogRepository extends JpaRepository<Article, Long> {
}
