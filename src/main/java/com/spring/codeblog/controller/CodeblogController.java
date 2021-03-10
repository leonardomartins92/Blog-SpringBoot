package com.spring.codeblog.controller;

import com.spring.codeblog.model.Postagem;
import com.spring.codeblog.service.CodeblogService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeblogController {
   @Autowired
    CodeblogService codeblogService;

   @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts(){
       ModelAndView mv = new ModelAndView("postagens");
       List<Postagem> posts = codeblogService.findAll();
       mv.addObject("postagens", posts);
       return mv;
   }

}
