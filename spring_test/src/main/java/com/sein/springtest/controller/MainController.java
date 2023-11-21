package com.sein.springtest.controller;

import com.sein.springtest.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequiredArgsConstructor
@Controller
public class MainController {
    private final MainService mainService;

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @PostMapping("/index")
    public String index() {
        return "index";
    }

    @ResponseBody
    @GetMapping("/data")
    public Map<String, Object> data() {
        Map<String, Object> result = mainService.getSeinMap();
        return result;
    }

    @ResponseBody
    @GetMapping("/dbData")
    public Map<String, Object> dbData() {
        Map<String, Object> result = mainService.getSeinDBMap();
        return result;
    }

}
