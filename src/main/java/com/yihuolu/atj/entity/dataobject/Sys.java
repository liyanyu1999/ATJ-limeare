package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName atj_sys
 */
@TableName(value ="atj_sys")
@Data
public class Sys  extends Model<Sys> implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 名称（键）
     */
    private String key;

    /**
     * 值
     */
    private String value;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}