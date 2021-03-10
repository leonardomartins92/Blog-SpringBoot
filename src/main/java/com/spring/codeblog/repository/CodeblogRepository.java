package com.spring.codeblog.repository;

import com.spring.codeblog.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Postagem, Long> {
}
