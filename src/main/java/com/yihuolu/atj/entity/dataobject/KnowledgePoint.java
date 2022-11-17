package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_knowledge_point
 */
@TableName(value ="atj_knowledge_point")
@Data
public class KnowledgePoint  extends Model<KnowledgePoint> implements Serializable {
    /**
     * 知识点编号
     */
    @TableId(type = IdType.AUTO)
    private Integer knowledgeId;

    /**
     * 科目编号
     */
    private Integer subjectId;

    /**
     * 章节编号
     */
    private Integer chapterId;

    /**
     * 知识点名称
     */
    private String knowledgeName;

    /**
     * 知识点描述
     */
    private String knowledgeDescription;

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