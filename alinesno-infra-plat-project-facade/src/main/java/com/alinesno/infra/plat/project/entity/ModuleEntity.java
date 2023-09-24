package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ModuleEntity实体类，对应于数据库中的project_module表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_module")
public class ModuleEntity extends BaseEntity {
    /**
     * 产品ID
     */
    @TableField("product")
    private Long product;

    /**
     * 模块名称
     */
    @TableField("name")
    private String name;

    /**
     * 父模块ID
     */
    @TableField("parent")
    private Long parent;

    /**
     * 路径
     */
    @TableField("path")
    private String path;

    /**
     * 等级
     */
    @TableField("grade")
    private Integer grade;

    /**
     * 排序
     */
    @TableField("order")
    private Integer order;

    /**
     * 视图
     */
    @TableField("view")
    private String view;
}
