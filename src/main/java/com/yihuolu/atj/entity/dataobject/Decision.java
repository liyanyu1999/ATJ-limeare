package com.yihuolu.atj.entity.dataobject;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 
 * @TableName atj_decision
 */
@TableName(value ="atj_decision")
@Data
public class Decision extends Model<Decision> implements Serializable {
    /**
     * 决策树节点编号
     */
    @TableId(type = IdType.AUTO)
    private Integer nodeId;

    /**
     * 问题编号
     */
    private Integer questionId;

    /**
     * 左节点编号，错误路径
     */
    private Integer leftNode;

    /**
     * 右节点编号，正确路径
     */
    private Integer rightNode;

    /**
     * 掌握的知识点列表
     */
    private String masterKnowledgeList;

    /**
     * 是否是叶子节点
     */
    private Boolean isLeaf;

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