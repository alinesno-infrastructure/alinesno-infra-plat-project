package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
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
	@ColumnType(length=255)
	@ColumnComment("产品")
    private Long product;

    @TableField("module")
	@ColumnType(length= 50)
	@ColumnComment("模块")
    private Long module;

    @TableField("path")
	@ColumnType(length=255)
	@ColumnComment("路径")
    private Long path;

    @TableField("story")
	@ColumnType(length= 255)
	@ColumnComment("故事")
    private Long story;

    @TableField("title")
	@ColumnType(length= 100)
	@ColumnComment("标题")
    private String title;

    @TableField("pri")
	@ColumnType(length=255)
	@ColumnComment(" 优先级")
    private Integer pri;

    @TableField("type")
	@ColumnType(length=255)
	@ColumnComment("类型")
    private String type;

    @TableField("status")
	@ColumnType(length=1)
	@ColumnComment("状态")
    private String status;

    @TableField("steps")
	@ColumnType(length= 10)
	@ColumnComment("步骤")
    private String steps;

    @TableField("frequency")
	@ColumnType(length= 10)
	@ColumnComment("频率")
    private String frequency;

    @TableField("order")
	@ColumnType(length= 10)
	@ColumnComment("顺序")
    private Integer order;

    @TableField("opened_by")
	@ColumnType(length=50)
	@ColumnComment("开发人员/创建者")
    private String openedBy;

    @TableField("opened_date")
	@ColumnType(length= 10)
	@ColumnComment("开户日期")
    private Date openedDate;

    @TableField("last_edited_by")
	@ColumnType(length= 50)
	@ColumnComment("最后编辑者")
    private String lastEditedBy;

    @TableField("last_edited_date")
	@ColumnType(length=19)
	@ColumnComment("最后编辑日期")
    private Date lastEditedDate;

    @TableField("version")
	@ColumnType(length= 10)
	@ColumnComment(" 版本")
    private Integer version;
}
