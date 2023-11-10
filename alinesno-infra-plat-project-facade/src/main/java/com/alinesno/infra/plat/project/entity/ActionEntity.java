package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ProjectActionEntity类代表项目动作实体。
 * 这个类包含了公司ID、对象类型、对象ID、操作者、动作、日期和注释等字段。
 * 每个字段的具体含义和用法已在下面的字段注释中详细描述。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_action")
public class ActionEntity extends BaseEntity {
    /**
     * 公司ID
     */
    @TableField("company")
	@ColumnType(length= 100)
	@ColumnComment("公司ID")
    private Long company;

    /**
     * 对象类型
     */
    @TableField("object_type")
	@ColumnType(length= 20)
	@ColumnComment("对象类型")
    private String objectType;

    /**
     * 对象ID
     */
    @TableField("object_id")
	@ColumnType(length= 50)
	@ColumnComment("对象ID")
    private Long objectId;

    /**
     * 操作者
     */
    @TableField("actor")
	@ColumnType(length=50)
	@ColumnComment("操作者")
    private String actor;

    /**
     * 动作
     */
    @TableField("action")
	@ColumnType(length= 20)
	@ColumnComment("动作")
    private String action;

    /**
     * 日期
     */
    @TableField("date")
	@ColumnType(length=10)
	@ColumnComment("日期")
    private Integer date;

    /**
     * 注释
     */
    @TableField("comment")
	@ColumnType(length=255)
	@ColumnComment("注释")
    private String comment;
}
