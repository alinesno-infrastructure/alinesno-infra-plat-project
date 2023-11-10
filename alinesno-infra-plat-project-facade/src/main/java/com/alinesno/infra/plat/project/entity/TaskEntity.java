package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * TaskEntity类代表了项目中的任务。
 * 这个类包含了项目ID、模块ID、故事ID、故事版本、来源Bug、标题、类型、优先级、预计、已消耗、剩余、截止日期、状态、邮件接收者、描述、打开者、打开日期、分配者、分配日期、预计开始日期、实际开始日期、完成者、完成日期、取消者、取消日期、关闭者、关闭日期、关闭原因、最后编辑者、最后编辑日期、是否删除等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_task")
public class TaskEntity extends BaseEntity {
    @TableField("project")
	@ColumnType(length= 50)
	@ColumnComment("项目")
    private Long project;

    @TableField("module")
	@ColumnType(length= 50)
	@ColumnComment("模块")
    private Long module;

    @TableField("story")
	@ColumnType(length=255)
	@ColumnComment("故事")
    private Long story;

    @TableField("story_version")
	@ColumnType(length= 10)
	@ColumnComment("故事版本")
    private Integer storyVersion;

    @TableField("from_bug")
	@ColumnType(length=255)
	@ColumnComment("来自错误")
    private Long fromBug;

    @TableField("name")
	@ColumnType(length= 50)
	@ColumnComment("名称")
    private String name;

    @TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
    private String type;

    @TableField("pri")
	@ColumnType(length=10)
	@ColumnComment("原数据库字段名")
    private Integer pri;

    @TableField("estimate")
	@ColumnType(length= 10)
	@ColumnComment("估计")
    private Float estimate;

    @TableField("consumed")
	@ColumnType(length= 10)
	@ColumnComment("已消费")
    private Float consumed;

    @TableField("left")
	@ColumnType(length= 255)
	@ColumnComment("左")
    private Float left;

    @TableField("deadline")
	@ColumnType(length=255)
	@ColumnComment("截止日期")
    private Date deadline;

    @TableField("status")
	@ColumnType(length= 10)
	@ColumnComment("状态")
    private String status;

    @TableField("mailto")
	@ColumnType(length=255)
	@ColumnComment("电子邮箱地址")
    private String mailto;

    @TableField("desc")
	@ColumnType(length=255)
	@ColumnComment("描述")
    private String desc;

    @TableField("opened_by")
	@ColumnType(length=50)
	@ColumnComment("开启者/创建者")
    private String openedBy;

    @TableField("opened_date")
	@ColumnType(length=10)
	@ColumnComment("开启日期")
    private Date openedDate;

    @TableField("assigned_to")
	@ColumnType(length=50)
	@ColumnComment("指派给")
    private String assignedTo;

    @TableField("assigned_date")
	@ColumnType(length=10)
	@ColumnComment("指定日期/分配日期")
    private Date assignedDate;

    @TableField("est_started")
	@ColumnType(length= 10)
	@ColumnComment("开始时间")
    private Date estStarted;

    @TableField("real_started")
	@ColumnType(length= 10)
	@ColumnComment("真实开始时间")
    private Date realStarted;

    @TableField("finished_by")
	@ColumnType(length=50)
	@ColumnComment("完成者")
    private String finishedBy;

    @TableField("finished_date")
	@ColumnType(length= 10)
	@ColumnComment(" 完成日期")
    private Date finishedDate;

    @TableField("canceled_by")
	@ColumnType(length= 20)
	@ColumnComment("取消者/撤销者/作废者")
    private String canceledBy;

    @TableField("canceled_date")
	@ColumnType(length=10)
	@ColumnComment(" 取消日期")
    private Date canceledDate;

    @TableField("closed_by")
	@ColumnType(length=50)
	@ColumnComment("关闭者/关闭人")
    private String closedBy;

    @TableField("closed_date")
	@ColumnType(length= 10)
	@ColumnComment("关闭日期")
    private Date closedDate;

    @TableField("closed_reason")
	@ColumnType(length=100)
	@ColumnComment("关闭原因")
    private String closedReason;

    @TableField("last_edited_by")
	@ColumnType(length=50)
	@ColumnComment("最后编辑者")
    private String lastEditedBy;

    @TableField("last_edited_date")
	@ColumnType(length= 10)
	@ColumnComment("最后编辑日期")
    private Date lastEditedDate;

    @TableField("deleted")
	@ColumnType(length=1)
	@ColumnComment("已删除")
    private String deleted;
}
