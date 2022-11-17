package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_question
 */
@TableName(value ="atj_question")
@Data
public class Question extends Model<Question> implements Serializable {
    /**
     * 问题编号
     */
    @TableId(type = IdType.AUTO)
    private Integer questionId;

    /**
     * 章节编号
     */
    private Integer chapterId;

    /**
     * 问题内容
     */
    private String questionContent;

    /**
     * 正确选项编号
     */
    private Integer rightAnswer;

    /**
     * 选项列表JSON
     */
    private String options;

    /**
     * 知识点组合列表
     */
    private String knowledgeList;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 乐观锁
     */
    private Integer version;

    /**
     * 创建时间
     */
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    private LocalDateTime updatedTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}