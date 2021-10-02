package com.example.firstproject.config;

import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InitData {

    @Autowired
    ArticleRepository articleRepository;

    @PostConstruct
    private void initAccount() throws IOException{
        if(articleRepository.count()==0){
            Resource resource = new ClassPathResource("계좌정보.csv");
            List<Article> accountList = Files.readAllLines(resource.getFile().toPath(), StandardCharsets.UTF_8)
                    .stream().skip(1).map(line -> {
                        String[] split = line.split(",");
                        return Article.builder().accountNo(split[0]).accountName(split[1]).branchCode(split[2])
                                .build();
                    }).collect(Collectors.toList());
            articleRepository.saveAll(accountList);
        }
    }
}
