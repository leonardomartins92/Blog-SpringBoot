package com.spring.codeblog.service;

import com.spring.codeblog.model.Postagem;

import java.util.List;

public interface CodeblogService {

    List<Postagem> findAll();
    Postagem findById(Long id);
    Postagem save(Postagem postagem);

    }

