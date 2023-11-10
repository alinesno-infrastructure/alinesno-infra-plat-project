package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * ProjectEffortEntity类代表了一个项目的工作量。
 * 这个类包含了账户、工作、日期、剩余工作量、已消耗工作量等字段。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_effort")
public class EffortEntity extends BaseEntity {
    @TableField("account")
	@ColumnType(length=50)
	@ColumnComment("账号")
    private String account;

    @TableField("work")
	@ColumnType(length= 50)
	@ColumnComment("工作")
    private String work;

    @TableField("date")
	@ColumnType(length= 10)
	@ColumnComment("日期")
    private LocalDate date;

    @TableField("left")
	@ColumnType(length=50)
	@ColumnComment("左侧")
    private Float left;

    @TableField("consumed")
	@ColumnType(length= 10)
	@ColumnComment("已消费")
    private Float consumed;
}
