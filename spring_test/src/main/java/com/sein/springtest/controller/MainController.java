package com.sein.springtest.controller;

import com.sein.springtest.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
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

    // 전체 데이터 브라우저 전체 조회
    @ResponseBody
    @GetMapping("/dbData")
    public List<Map<String, Object>> dbData() {
        List<Map<String, Object>> result = mainService.getSeinDBMap();
        return result;
    }
    
    //데이터 추가
    @ResponseBody
    @PostMapping("insertData")
    public void insertData(Map<String, Object> data){
        mainService.getInsertDb(data);

    }
    //데이터 수정
    @ResponseBody
    @PostMapping("updateData")
    public void updateData(Map<String, Object> data){
      mainService.getUpdateDb(data);

    }
    //데이터 삭제
    @ResponseBody
    @GetMapping("deleteData")
    public void deleteData(Map<String,Object> data){
    mainService.getDeleteDb(data);

    }
}
