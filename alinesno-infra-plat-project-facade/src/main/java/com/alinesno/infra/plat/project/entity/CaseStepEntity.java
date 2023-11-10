package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
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
	@ColumnType(length= 50)
	@ColumnComment("案例编号")
    private Long caseId;

    @TableField("version")
	@ColumnType(length= 10)
	@ColumnComment("版本")
    private Integer version;

    @TableField("desc")
	@ColumnType(length=255)
	@ColumnComment("描述")
    private String desc;

    @TableField("expect")
	@ColumnType(length= 255)
	@ColumnComment("期望、预期")
    private String expect;
}
