package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller

public class HomeController {

@RequestMapping("/")
public String home() {
return "board/list";
}
    @RequestMapping("classlist")
    public String classList(Model model) {
        model.addAttribute("title","2학년 2학기 교과목 리스트");
        List<String> list = new ArrayList<String>();
        String msg = "2학년 2학기 교과목 리스트";
        list.add("Computer Architecture");
        list.add("Logic Design");
        model.addAttribute("list", list);

        return "board/list";
    }
}
