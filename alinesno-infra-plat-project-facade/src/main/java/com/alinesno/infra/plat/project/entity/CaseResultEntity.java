package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ProjectCaseResultEntity类代表了一个项目测试用例的执行结果。
 * 这个类包含了计划ID、构建ID、用例ID、结果、状态、执行者、执行日期、步骤等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_case_result")
public class CaseResultEntity extends BaseEntity {
    @TableField("plan")
	@ColumnType(length=100)
	@ColumnComment("计划")
    private Long plan;

    @TableField("build")
	@ColumnType(length=255)
	@ColumnComment("构建")
    private Long build;

    @TableField("case_id")
	@ColumnType(length=50)
	@ColumnComment("案例编号")
    private Long caseId;

    @TableField("result")
	@ColumnType(length=255)
	@ColumnComment("结果")
    private String result;

    @TableField("status")
	@ColumnType(length= 10)
	@ColumnComment("状态")
    private String status;

    @TableField("executed_by")
	@ColumnType(length=50)
	@ColumnComment("执行者")
    private String executedBy;

    @TableField("executed_date")
	@ColumnType(length= 10)
	@ColumnComment("执行日期")
    private Integer executedDate;

    @TableField("steps")
	@ColumnType(length= 10)
	@ColumnComment("步骤")
    private String steps;
}
