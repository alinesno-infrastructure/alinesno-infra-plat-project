package com.alinesno.infra.plat.project.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * ProjectBugEntity类代表了一个项目中的bug。
 * 这个类包含了产品ID、模块ID、项目ID、故事ID、任务ID、标题、严重性、类型、操作系统、浏览器、硬件、发现者、步骤、状态、邮件接收者、打开者、打开日期、打开版本、分配者、分配日期、解决者、解决方案、解决版本、解决日期、关闭者、关闭日期、最后编辑者、最后编辑日期等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_bug")
public class BugEntity extends BaseEntity {
    /**
     * 产品ID
     */
	@ColumnType(length= 255)
	@ColumnComment("产品ID")
	@TableField("product")
    private Long product;

    /**
     * 模块ID
     */
	@ColumnType(length= 50)
	@ColumnComment("模块ID")
	@TableField("module")
    private Long module;

    /**
     * 项目ID
     */
	@ColumnType(length=50)
	@ColumnComment("项目ID")
	@TableField("project")
    private Long project;

    /**
     * 故事ID
     */
	@ColumnType(length=255)
	@ColumnComment("故事ID")
	@TableField("story")
    private Long story;

    /**
     * 任务ID
     */
	@ColumnType(length=255)
	@ColumnComment("任务ID")
	@TableField("task")
    private Long task;

    /**
     * 标题
     */
	@ColumnType(length=255)
	@ColumnComment("标题")
	@TableField("title")
    private String title;

    /**
     * 严重性
     */
	@ColumnType(length=4)
	@ColumnComment("严重性")
	@TableField("severity")
    private Integer severity;

    /**
     * 类型
     */
	@ColumnType(length=255)
	@ColumnComment("类型")
	@TableField("type")
    private String type;

    /**
     * 操作系统
     */
	@ColumnType(length=50)
	@ColumnComment("操作系统")
	@TableField("os")
    private String os;

    /**
     * 浏览器
     */
	@ColumnType(length=50)
	@ColumnComment("浏览器")
	@TableField("browser")
    private String browser;

    /**
     * 硬件
     */
	@ColumnType(length= 50)
	@ColumnComment("硬件")
	@TableField("hardware")
    private String hardware;

    /**
     * 发现者
     */
	@ColumnType(length=255)
	@ColumnComment("发现者")
	@TableField("found")
    private String found;

    /**
     * 步骤
     */
	@ColumnType(length= 10)
	@ColumnComment("步骤")
	@TableField("steps")
    private String steps;

    /**
     * 状态
     */
	@ColumnType(length= 10)
	@ColumnComment("状态")
	@TableField("status")
    private String status;

    /**
     * 邮件接收者
     */
	@ColumnType(length=255)
	@ColumnComment("邮件接收者")
	@TableField("mailto")
    private String mailto;

    /**
     * 打开者
     */
	@ColumnType(length=50)
	@ColumnComment("打开者")
	@TableField("opened_by")
    private String openedBy;

    /**
     * 打开日期
     */
	@ColumnType(length=10)
	@ColumnComment("打开日期")
	@TableField("opened_date")
    private Date openedDate;

    /**
     * 打开版本
     */
	@ColumnType(length=100)
	@ColumnComment("打开版本")
	@TableField("opened_build")
    private String openedBuild;

    /**
     * 分配者
     */
	@ColumnType(length=50)
	@ColumnComment("分配者")
	@TableField("assigned_to")
    private String assignedTo;

    /**
     * 分配日期
     */
	@ColumnType(length= 10)
	@ColumnComment("分配日期")
	@TableField("assigned_date")
    private Date assignedDate;

    /**
     * 解决者
     */
	@ColumnType(length=50)
	@ColumnComment("解决者")
	@TableField("resolved_by")
    private String resolvedBy;

    /**
     * 解决方案
     */
	@ColumnType(length=50)
	@ColumnComment("解决方案")
	@TableField("resolution")
    private String resolution;

    /**
     * 解决版本
     */
	@ColumnType(length= 50)
	@ColumnComment("解决版本")
	@TableField("resolved_build")
    private String resolvedBuild;

    /**
     * 解决日期
     */
	@ColumnType(length=10)
	@ColumnComment("解决日期")
	@TableField("resolved_date")
    private Date resolvedDate;

    /**
     * 关闭者
     */
	@ColumnType(length=50)
	@ColumnComment("关闭者")
	@TableField("closed_by")
    private String closedBy;

    /**
     * 关闭日期
     */
	@ColumnType(length=10)
	@ColumnComment("关闭日期")
	@TableField("closed_date")
    private Date closedDate;

    /**
     * 最后编辑者
     */
	@ColumnType(length=50)
	@ColumnComment("最后编辑者")
	@TableField("last_edited_by")
    private String lastEditedBy;

    /**
     * 最后编辑日期
     */
	@ColumnType(length= 10)
	@ColumnComment("最后编辑日期")
	@TableField("last_edited_date")
    private Date lastEditedDate;
}
