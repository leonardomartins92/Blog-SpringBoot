package com.spring.codeblog.service.serviceImpl;

import com.spring.codeblog.model.Postagem;
import com.spring.codeblog.repository.CodeblogRepository;
import com.spring.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    @Autowired
    CodeblogRepository codeblogRepository; //injetou o repositorio

    @Override
    public List<Postagem> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Postagem findById(Long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Postagem save(Postagem postagem) {
        return codeblogRepository.save(postagem);
    }
}
