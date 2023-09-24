package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * ProjectDocEntity类代表了一个项目文档。
 * 这个类包含了产品ID、模块ID、项目ID、库ID、标题、类型、状态、创建者、创建日期、最后编辑者、最后编辑日期、版本等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_doc")
public class DocEntity extends BaseEntity {
    @TableField("product")
    private Long product;

    @TableField("module")
    private Long module;

    @TableField("project")
    private Long project;

    @TableField("lib")
    private Long lib;

    @TableField("title")
    private String title;

    @TableField("type")
    private String type;

    @TableField("status")
    private String status;

    @TableField("opened_by")
    private String openedBy;

    @TableField("opened_date")
    private LocalDateTime openedDate;

    @TableField("last_edited_by")
    private String lastEditedBy;

    @TableField("last_edited_date")
    private LocalDateTime lastEditedDate;

    @TableField("version")
    private Integer version;
}
