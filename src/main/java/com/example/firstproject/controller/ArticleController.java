package com.example.firstproject.controller;

import com.example.firstproject.Dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j // 로깅을 위한 annotation
public class ArticleController {
    @Autowired  // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    //DTO (data transfer object)
    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        // 1.DTO를 Entity로 변환
        Article article = form.toEntity();
        log.info(article.toString());
//       System.out.println(article.toString()); -> 로깅 기능으로 대체

        // 2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
//       System.out.println(saved.toString());

        return "";
    }
}
