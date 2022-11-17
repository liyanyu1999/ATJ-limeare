package com.yihuolu.atj.entity.dataobject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KnowledgePointTest {


    @Test
    void getKnowledgePointList() {
        KnowledgePoint knowledgePoint = new KnowledgePoint();
        List<KnowledgePoint> knowledgePointList = knowledgePoint.selectAll();
        knowledgePointList.forEach(System.out::println);
    }
}