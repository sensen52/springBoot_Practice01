package com.sein.springtest.service;

import com.sein.springtest.dao.MainDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

// 다른 어플리케이션으로 가거나, 비즈니스 로직이 정의된 곳
@RequiredArgsConstructor
@Service
public class MainService {
    private final MainDao mainDao;
    public Map<String, Object> getSeinMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("name", "세인");
        result.put("age", 25);
        return result;
    }
    public Map<String, Object> getSeinDBMap() {
        Map<String, Object> result = mainDao.getSeinDBMap();
        return result;
    }
}
