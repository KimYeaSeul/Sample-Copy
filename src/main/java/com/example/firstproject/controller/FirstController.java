package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    //annotation
    // hi라는 주소로 greetings 라는 이름을 가진 페이지를 오픈
    @GetMapping("/hi")
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "예슬"); // 변수등록 메서드
        return "greetings"; //templates/greetings.mustache -> 브라우저로 전송
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "yeaseul");
        return "goodbye";
    }
}
