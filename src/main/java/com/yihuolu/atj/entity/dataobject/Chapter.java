package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 	
 * @TableName atj_chapter
 */
@TableName(value ="atj_chapter")
@Data
public class Chapter extends Model<Chapter> implements Serializable {
    /**
     * 章节编号
     */
    @TableId(type = IdType.AUTO)
    private Integer chapterId;

    /**
     * 学科编号
     */
    private Integer subjectId;

    /**
     * 章节名称
     */
    private String chapterName;

    /**
     * 决策树头节点编号列表
     */
    private String decisionList;

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
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updatedTime;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}