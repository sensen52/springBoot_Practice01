package com.sein.springtest.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@Slf4j
public class PersonDaoTests {
    @Autowired
    MainDao maindao;

    @Test
    public void insertTest() {
        Map<String, Object> insertData = new HashMap<>();
        insertData.put("name", "곽두팔");
        insertData.put("age", 50);
        maindao.InsertDb(insertData);
        log.info(insertData.toString());

    }

    @Test
    public void updateTest(){
        Map<String, Object> updateData = new HashMap<>();
        updateData.put("name", "곽두팔");
        updateData.put("age", 15);
        maindao.updateDb(updateData);
        log.info(updateData.toString());
    }

    @Test
    public void deleteTest(){
        Map<String, Object> deleteData = new HashMap<>();
        deleteData.put("name","김수광");
        maindao.deleteDb(deleteData);
        log.info(deleteData.toString());
        }
}
