package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
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
	@ColumnType(length= 100)
	@ColumnComment("产品")
    private Long product;

    @TableField("module")
	@ColumnType(length= 50)
	@ColumnComment("模块")
    private Long module;

    @TableField("project")
	@ColumnType(length= 50)
	@ColumnComment("项目")
    private Long project;

    @TableField("lib")
	@ColumnType(length=50)
	@ColumnComment("图书馆")
    private Long lib;

    @TableField("title")
	@ColumnType(length=255)
	@ColumnComment("<标题>")
    private String title;

    @TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
    private String type;

    @TableField("status")
	@ColumnType(length=1)
	@ColumnComment("状态")
    private String status;

    @TableField("opened_by")
	@ColumnType(length= 50)
	@ColumnComment("开启者/创建者")
    private String openedBy;

    @TableField("opened_date")
	@ColumnType(length= 10)
	@ColumnComment(" 开通日期")
    private LocalDateTime openedDate;

    @TableField("last_edited_by")
	@ColumnType(length= 50)
	@ColumnComment("<最后编辑者>")
    private String lastEditedBy;

    @TableField("last_edited_date")
	@ColumnType(length= 10)
	@ColumnComment("最后编辑日期")
    private LocalDateTime lastEditedDate;

    @TableField("version")
	@ColumnType(length= 10)
	@ColumnComment("版本号")
    private Integer version;
}
