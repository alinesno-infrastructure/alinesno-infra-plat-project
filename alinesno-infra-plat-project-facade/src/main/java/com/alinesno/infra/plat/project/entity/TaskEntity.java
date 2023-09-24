package com.alinesno.infra.plat.project.entity;

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
    private Long project;

    @TableField("module")
    private Long module;

    @TableField("story")
    private Long story;

    @TableField("story_version")
    private Integer storyVersion;

    @TableField("from_bug")
    private Long fromBug;

    @TableField("name")
    private String name;

    @TableField("type")
    private String type;

    @TableField("pri")
    private Integer pri;

    @TableField("estimate")
    private Float estimate;

    @TableField("consumed")
    private Float consumed;

    @TableField("left")
    private Float left;

    @TableField("deadline")
    private Date deadline;

    @TableField("status")
    private String status;

    @TableField("mailto")
    private String mailto;

    @TableField("desc")
    private String desc;

    @TableField("opened_by")
    private String openedBy;

    @TableField("opened_date")
    private Date openedDate;

    @TableField("assigned_to")
    private String assignedTo;

    @TableField("assigned_date")
    private Date assignedDate;

    @TableField("est_started")
    private Date estStarted;

    @TableField("real_started")
    private Date realStarted;

    @TableField("finished_by")
    private String finishedBy;

    @TableField("finished_date")
    private Date finishedDate;

    @TableField("canceled_by")
    private String canceledBy;

    @TableField("canceled_date")
    private Date canceledDate;

    @TableField("closed_by")
    private String closedBy;

    @TableField("closed_date")
    private Date closedDate;

    @TableField("closed_reason")
    private String closedReason;

    @TableField("last_edited_by")
    private String lastEditedBy;

    @TableField("last_edited_date")
    private Date lastEditedDate;

    @TableField("deleted")
    private String deleted;
}
