package com.yihuolu.atj.entity.dataobject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DecisionTest {

    @Test
    public void testInsert() {
        Decision decision0 = new Decision();
        Decision decision1 = new Decision();
        Decision decision2 = new Decision();
        Decision decision3 = new Decision();
        Decision decision4 = new Decision();

        // 假设decision0 是头节点，那么先插入
        decision0.setQuestionId(0);
        // 相关属性注入
        // decision0.setXXX();
        // ...
        decision0.insert();
        // 插入后就能拿到NodeId
        System.out.println(decision0.getNodeId());

        // 接下去再把所有的节点插入
        // ...
        // 重新在遍历一遍这棵树，因为上面的Descision插入后就能拿到nodeId了，所以这次遍历，
        // 就是去update，每个节点的leftNode和rightNode

        // 例如：
        decision0.setLeftNode(decision1.getNodeId());
        decision0.updateById();
        // ...


    }

}