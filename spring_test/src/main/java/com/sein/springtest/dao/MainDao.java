package com.sein.springtest.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Repository
public class MainDao {
    private final SqlSessionTemplate sqlSessionTemplate;


    public List<Map<String, Object>> getSeinDBMap() {
        return sqlSessionTemplate.selectList("MainMapper.getSeinDBMap");
    }


    public void InsertDb(Map<String,Object> data){
        sqlSessionTemplate.insert("MainMapper.insertDb", data);
    }

    public void updateDb(Map<String,Object> data){
        sqlSessionTemplate.update("MainMapper.updateDb", data);
    }

    public void deleteDb(Map<String,Object> data){
        sqlSessionTemplate.delete("MainMapper.deleteDb", data);
    }
}
