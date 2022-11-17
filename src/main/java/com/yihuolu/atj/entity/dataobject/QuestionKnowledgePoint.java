package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_question_knowledge_point
 */
@TableName(value ="atj_question_knowledge_point")
@Data
public class QuestionKnowledgePoint  extends Model<QuestionKnowledgePoint> implements Serializable {
    /**
     * 关联编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 知识点编号
     */
    private Integer knowledgeId;

    /**
     * 问题编号
     */
    private Integer questionId;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Boolean isDeleted;

    /**
     * 乐观锁
     */
    @Version
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