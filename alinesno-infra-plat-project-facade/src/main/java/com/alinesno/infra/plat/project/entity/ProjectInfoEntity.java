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
	@ColumnType(length=50)
	@ColumnComment("公司ID")
    private Long company;

    /**
     * 是否为分类
     */
    @TableField("is_cat")
	@ColumnType(length=1)
	@ColumnComment("是否为分类")
    private String isCat;

    /**
     * 分类ID
     */
    @TableField("cat_id")
	@ColumnType(length= 10)
	@ColumnComment("分类ID")
    private Long catId;

    /**
     * 类型
     */
    @TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
    private String type;

    /**
     * 父项目ID
     */
    @TableField("parent")
	@ColumnType(length=255)
	@ColumnComment("父项目ID")
    private Long parent;

    /**
     * 项目名称
     */
    @TableField("name")
	@ColumnType(length= 50)
	@ColumnComment("项目名称")
    private String name;

    /**
     * 项目代码
     */
    @TableField("code")
	@ColumnType(length=50)
	@ColumnComment("项目代码")
    private String code;

    /**
     * 项目开始日期
     */
    @TableField("begin")
	@ColumnType(length=50)
	@ColumnComment("项目开始日期")
    private LocalDate begin;

    /**
     * 项目结束日期
     */
    @TableField("end")
	@ColumnType(length= 10)
	@ColumnComment("项目结束日期")
    private LocalDate end;

    /**
     * 项目状态
     */
    @TableField("status")
	@ColumnType(length= 10)
	@ColumnComment("项目状态")
    private String status;

    /**
     * 项目阶段
     */
    @TableField("stage")
	@ColumnType(length=10)
	@ColumnComment("项目阶段")
    private String stage;

    /**
     * 项目优先级
     */
    @TableField("pri")
	@ColumnType(length=255)
	@ColumnComment("项目优先级")
    private String pri;

    /**
     * 项目描述
     */
    @TableField("desc")
	@ColumnType(length=255)
	@ColumnComment("项目描述")
    private String desc;

    /**
     * 项目目标
     */
    @TableField("goal")
	@ColumnType(length=255)
	@ColumnComment("项目目标")
    private String goal;

    /**
     * 项目开启者
     */
    @TableField("opened_by")
	@ColumnType(length=50)
	@ColumnComment("项目开启者")
    private String openedBy;

    /**
     * 项目开启日期
     */
    @TableField("opened_date")
	@ColumnType(length=10)
	@ColumnComment("项目开启日期")
    private Long openedDate;

    /**
     * 项目关闭者
     */
    @TableField("closed_by")
	@ColumnType(length=20)
	@ColumnComment("项目关闭者")
    private String closedBy;

    /**
     * 项目关闭日期
     */
    @TableField("closed_date")
	@ColumnType(length=10)
	@ColumnComment("项目关闭日期")
    private Long closedDate;

    /**
     * 项目取消者
     */
    @TableField("canceled_by")
	@ColumnType(length=50)
	@ColumnComment("项目取消者")
    private String canceledBy;

    /**
     * 项目取消日期
     */
    @TableField("canceled_date")
	@ColumnType(length=10)
	@ColumnComment("项目取消日期")
    private Long canceledDate;

    /**
     * 项目所有者
     */
    @TableField("PO")
	@ColumnType(length=30)
	@ColumnComment("项目所有者")
    private String PO;

    /**
     * 项目经理
     */
    @TableField("PM")
	@ColumnType(length= 50)
	@ColumnComment("项目经理")
    private String PM;

    /**
     * 质量管理者
     */
    @TableField("QM")
	@ColumnType(length=50)
	@ColumnComment("质量管理者")
    private String QM;

    /**
     * 项目团队
     */
    @TableField("team")
	@ColumnType(length= 50)
	@ColumnComment("项目团队")
    private String team;
}
