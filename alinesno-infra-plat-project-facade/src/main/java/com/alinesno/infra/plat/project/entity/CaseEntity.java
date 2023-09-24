package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * ProjectCaseEntity类代表了一个项目中的测试用例。
 * 这个类包含了产品ID、模块ID、路径ID、故事ID、标题、优先级、类型、状态、步骤、频率、顺序、打开者、打开日期、最后编辑者、最后编辑日期、字段1、字段2、字段3、版本等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_case")
public class CaseEntity extends BaseEntity {
    @TableField("product")
    private Long product;

    @TableField("module")
    private Long module;

    @TableField("path")
    private Long path;

    @TableField("story")
    private Long story;

    @TableField("title")
    private String title;

    @TableField("pri")
    private Integer pri;

    @TableField("type")
    private String type;

    @TableField("status")
    private String status;

    @TableField("steps")
    private String steps;

    @TableField("frequency")
    private String frequency;

    @TableField("order")
    private Integer order;

    @TableField("opened_by")
    private String openedBy;

    @TableField("opened_date")
    private Date openedDate;

    @TableField("last_edited_by")
    private String lastEditedBy;

    @TableField("last_edited_date")
    private Date lastEditedDate;

    @TableField("version")
    private Integer version;
}
