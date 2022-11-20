package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_teacher_info
 */
@TableName(value ="atj_teacher_info")
@Data
public class TeacherInfo extends Model<TeacherInfo> implements Serializable {
    /**
     * 信息编号
     */
    @TableId
    private Integer infoId;

    /**
     * 教师编号
     */
    private String teacherNo;

    /**
     * 头衔
     */
    private String title;

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