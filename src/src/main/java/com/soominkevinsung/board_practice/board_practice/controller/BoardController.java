package com.soominkevinsung.board_practice.board_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/hello")
    public String Hello() {
        // 템플릿 경로 (templates)
        return "/boards/hello";
    }
}
