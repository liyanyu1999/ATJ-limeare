package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_user
 */
@TableName(value ="atj_user")
@Data
public class User  extends Model<User> implements Serializable {
    /**
     * 用户编号
     */
    @TableId
    private Integer userId;

    /**
     * 登录用户名
     */
    private String userName;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 头像链接
     */
    private String avatar;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 微信OpenID
     */
    private String wxOpenid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 信息编号
     */
    private Integer infoId;

    /**
     * 是否是学生
     */
    private Boolean isStudent;

    /**
     * 是否禁用
     */
    private Boolean isDisabled;

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