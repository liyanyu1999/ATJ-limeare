package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_classa
 */
@TableName(value ="atj_classa")
@Data
public class Classa extends Model<Classa> implements Serializable {
    /**
     * 班级编号
     */
    @TableId
    private Integer classId;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 管理员编号
     */
    private Integer managerId;

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