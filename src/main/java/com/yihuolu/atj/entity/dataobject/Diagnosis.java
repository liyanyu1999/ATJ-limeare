package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_diagnosis
 */
@TableName(value ="atj_diagnosis")
@Data
public class Diagnosis  extends Model<Diagnosis> implements Serializable {
    /**
     * 诊断记录编号
     */
    @TableId(type = IdType.AUTO)
    private Integer diagnosisId;

    /**
     * 章节编号
     */
    private Integer chapterId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 诊断记录标识名
     */
    private String diagnosisName;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 耗时
     */
    private Integer spendTime;

    /**
     * 未掌握的知识点列表
     */
    private String notMasterKnowledge;

    /**
     * 答题情况，分数形式
     */
    private String accuracy;

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