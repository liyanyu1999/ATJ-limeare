package com.yihuolu.atj.entity.dataobject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class QuestionTest {

    @Test
    void getQuestionList() {
        Question question = new Question();
        List<Question> questionList = question.selectAll();
        questionList.forEach(item -> {
            System.out.println(item.getQuestionContent().replace("\\r\\n", ""));
        });
    }

}