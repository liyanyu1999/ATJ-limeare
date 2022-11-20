package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_student_info
 */
@TableName(value ="atj_student_info")
@Data
public class StudentInfo  extends Model<StudentInfo> implements Serializable {
    /**
     * 信息编号
     */
    @TableId
    private Integer infoId;

    /**
     * 学生编号
     */
    private String studentNo;

    /**
     * 班级编号
     */
    private Integer classId;

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