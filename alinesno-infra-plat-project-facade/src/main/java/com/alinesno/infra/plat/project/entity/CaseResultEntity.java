package com.alinesno.infra.plat.project.entity;

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
    private Long plan;

    @TableField("build")
    private Long build;

    @TableField("case_id")
    private Long caseId;

    @TableField("result")
    private String result;

    @TableField("status")
    private String status;

    @TableField("executed_by")
    private String executedBy;

    @TableField("executed_date")
    private Integer executedDate;

    @TableField("steps")
    private String steps;
}
