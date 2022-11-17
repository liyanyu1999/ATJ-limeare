package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_diagnosis_detail
 */
@TableName(value ="atj_diagnosis_detail")
@Data
public class DiagnosisDetail extends Model<DiagnosisDetail> implements Serializable {
    /**
     * 诊断详情编号
     */
    @TableId(type = IdType.AUTO)
    private Integer diagnosisDetailId;

    /**
     * 诊断编号
     */
    private Integer diagnosisId;

    /**
     * 问题编号
     */
    private Integer questionId;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 答题结果
     */
    private Integer answerResult;

    /**
     * 诊断结果
     */
    private Integer diagnosisResult;

    /**
     * 是否是猜对的
     */
    private Boolean isGuess;

    /**
     * 是否是失误做错的
     */
    private Boolean isCareless;

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