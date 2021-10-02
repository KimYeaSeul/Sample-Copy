package com.example.firstproject.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Article Type의 Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data  // getter , setter
@Entity // DB가 해당 객체를 인식 가능
public class Article {

    @Id //대표값을 지정
//    @GeneratedValue
//    private  Long id;
    private String accountNo;
    @Column // DB에서 인식 할 수 있게 annotation
//    private String title;
    private String accountName;

    @Column
//    private  String content;
    private String branchCode;

//    public Article(Long id, String title, String content) {
//        this.id = id;
//        this.title = title;
//        this.content = content;
//    }

//    @Override
//    public String toString() {
//        return "Article{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", content='" + content + '\'' +
//                '}';
//    }
}
