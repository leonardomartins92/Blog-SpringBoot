package com.spring.codeblog.utils;

import com.spring.codeblog.model.Postagem;
import com.spring.codeblog.repository.CodeblogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Component
public class DummyData {
    @Autowired
    CodeblogRepository codeblogRepository;

   // @PostConstruct //executa o metodo sempre que for inicializado o sistema
    public void savePostagem() {

        Postagem postagem1 = new Postagem();
        postagem1.setAutor("Leo");
        postagem1.setData(LocalDate.now());
        postagem1.setTitulo("Docker");
        postagem1.setTexto("Minha vo tem muitas joias mas");

        Postagem postagem2 = new Postagem();
        postagem2.setAutor("Maria");
        postagem2.setData(LocalDate.now());
        postagem2.setTitulo("Github");
        postagem2.setTexto("Minha gata tem nariz");

        Postagem saved = codeblogRepository.save(postagem1);
        System.out.println(saved.getId());
        saved = codeblogRepository.save(postagem2);
        System.out.println(saved.getId());
    }
}
