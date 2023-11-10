package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
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
	@ColumnType(length=255)
	@ColumnComment("产品ID")
    private Long product;

    /**
     * 模块名称
     */
    @TableField("name")
	@ColumnType(length=50)
	@ColumnComment("模块名称")
    private String name;

    /**
     * 父模块ID
     */
    @TableField("parent")
	@ColumnType(length=255)
	@ColumnComment("父模块ID")
    private Long parent;

    /**
     * 路径
     */
    @TableField("path")
	@ColumnType(length=255)
	@ColumnComment("路径")
    private String path;

    /**
     * 等级
     */
    @TableField("grade")
	@ColumnType(length= 2)
	@ColumnComment("等级")
    private Integer grade;

    /**
     * 排序
     */
    @TableField("order")
	@ColumnType(length= 10)
	@ColumnComment("排序")
    private Integer order;

    /**
     * 视图
     */
    @TableField("view")
	@ColumnType(length=50)
	@ColumnComment("视图")
    private String view;
}
