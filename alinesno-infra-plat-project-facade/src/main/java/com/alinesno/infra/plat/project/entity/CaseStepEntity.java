package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ProjectCaseStepEntity类代表了一个项目测试用例的步骤。
 * 这个类包含了版本、描述、预期结果等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_case_step")
public class CaseStepEntity extends BaseEntity {

    @TableField("case_id")
    private Long caseId ;

    @TableField("version")
    private Integer version;

    @TableField("desc")
    private String desc;

    @TableField("expect")
    private String expect;
}
