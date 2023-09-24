package com.alinesno.infra.plat.project.entity;

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
    private Long company;

    /**
     * 对象类型
     */
    @TableField("object_type")
    private String objectType;

    /**
     * 对象ID
     */
    @TableField("object_id")
    private Long objectId;

    /**
     * 操作者
     */
    @TableField("actor")
    private String actor;

    /**
     * 动作
     */
    @TableField("action")
    private String action;

    /**
     * 日期
     */
    @TableField("date")
    private Integer date;

    /**
     * 注释
     */
    @TableField("comment")
    private String comment;
}
