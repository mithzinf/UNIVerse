package com.demo.universe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UnivMainController {

    //유니버스 메인 페이지 가는 메소드, 도메인 주소 /main
   @GetMapping("/main")
   public String main() {
        System.out.println("메인페이지 얍");
        return "main";
    }
}
