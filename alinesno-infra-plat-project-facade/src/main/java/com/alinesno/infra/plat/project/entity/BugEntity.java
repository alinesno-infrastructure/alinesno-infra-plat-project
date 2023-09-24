package com.alinesno.infra.plat.project.entity;

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
    private Long product;

    /**
     * 模块ID
     */
    private Long module;

    /**
     * 项目ID
     */
    private Long project;

    /**
     * 故事ID
     */
    private Long story;

    /**
     * 任务ID
     */
    private Long task;

    /**
     * 标题
     */
    private String title;

    /**
     * 严重性
     */
    private Integer severity;

    /**
     * 类型
     */
    private String type;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 硬件
     */
    private String hardware;

    /**
     * 发现者
     */
    private String found;

    /**
     * 步骤
     */
    private String steps;

    /**
     * 状态
     */
    private String status;

    /**
     * 邮件接收者
     */
    private String mailto;

    /**
     * 打开者
     */
    private String openedBy;

    /**
     * 打开日期
     */
    private Date openedDate;

    /**
     * 打开版本
     */
    private String openedBuild;

    /**
     * 分配者
     */
    private String assignedTo;

    /**
     * 分配日期
     */
    private Date assignedDate;

    /**
     * 解决者
     */
    private String resolvedBy;

    /**
     * 解决方案
     */
    private String resolution;

    /**
     * 解决版本
     */
    private String resolvedBuild;

    /**
     * 解决日期
     */
    private Date resolvedDate;

    /**
     * 关闭者
     */
    private String closedBy;

    /**
     * 关闭日期
     */
    private Date closedDate;

    /**
     * 最后编辑者
     */
    private String lastEditedBy;

    /**
     * 最后编辑日期
     */
    private Date lastEditedDate;
}
