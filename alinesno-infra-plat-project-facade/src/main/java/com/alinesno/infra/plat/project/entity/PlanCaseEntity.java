package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * PlanCaseEntity实体类，对应于数据库中的project_plan_case表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_plan_case")
public class PlanCaseEntity extends BaseEntity {
    /**
     * 计划ID
     */
    @TableField("plan")
    private Long plan;

    /**
     * 案例ID
     */
    @TableField("case_id")
    private Long caseId;

    /**
     * 案例版本
     */
    @TableField("case_version")
    private Integer caseVersion;

    /**
     * 指派给
     */
    @TableField("assigned_to")
    private String assignedTo;

    /**
     * 指派日期
     */
    @TableField("assigned_date")
    private Long assignedDate;
}
