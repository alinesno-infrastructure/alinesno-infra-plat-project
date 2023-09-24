package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * ProjectInfoEntity实体类，对应于数据库中的project_info表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_info")
public class ProjectInfoEntity extends BaseEntity {
    /**
     * 公司ID
     */
    @TableField("company")
    private Long company;

    /**
     * 是否为分类
     */
    @TableField("is_cat")
    private String isCat;

    /**
     * 分类ID
     */
    @TableField("cat_id")
    private Long catId;

    /**
     * 类型
     */
    @TableField("type")
    private String type;

    /**
     * 父项目ID
     */
    @TableField("parent")
    private Long parent;

    /**
     * 项目名称
     */
    @TableField("name")
    private String name;

    /**
     * 项目代码
     */
    @TableField("code")
    private String code;

    /**
     * 项目开始日期
     */
    @TableField("begin")
    private LocalDate begin;

    /**
     * 项目结束日期
     */
    @TableField("end")
    private LocalDate end;

    /**
     * 项目状态
     */
    @TableField("status")
    private String status;

    /**
     * 项目阶段
     */
    @TableField("stage")
    private String stage;

    /**
     * 项目优先级
     */
    @TableField("pri")
    private String pri;

    /**
     * 项目描述
     */
    @TableField("desc")
    private String desc;

    /**
     * 项目目标
     */
    @TableField("goal")
    private String goal;

    /**
     * 项目开启者
     */
    @TableField("opened_by")
    private String openedBy;

    /**
     * 项目开启日期
     */
    @TableField("opened_date")
    private Long openedDate;

    /**
     * 项目关闭者
     */
    @TableField("closed_by")
    private String closedBy;

    /**
     * 项目关闭日期
     */
    @TableField("closed_date")
    private Long closedDate;

    /**
     * 项目取消者
     */
    @TableField("canceled_by")
    private String canceledBy;

    /**
     * 项目取消日期
     */
    @TableField("canceled_date")
    private Long canceledDate;

    /**
     * 项目所有者
     */
    @TableField("PO")
    private String PO;

    /**
     * 项目经理
     */
    @TableField("PM")
    private String PM;

    /**
     * 质量管理者
     */
    @TableField("QM")
    private String QM;

    /**
     * 项目团队
     */
    @TableField("team")
    private String team;
}
