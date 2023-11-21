package com.sein.springtest.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@RequiredArgsConstructor
@Repository
public class MainDao {
    private final SqlSessionTemplate sqlSessionTemplate;


    public Map<String, Object> getSeinDBMap() {
        return sqlSessionTemplate.selectOne("MainMapper.getSeinDBMap");
    }
}
