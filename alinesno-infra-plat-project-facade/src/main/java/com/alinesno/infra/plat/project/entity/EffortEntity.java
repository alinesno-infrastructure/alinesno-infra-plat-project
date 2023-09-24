package com.alinesno.infra.plat.project.entity;

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
    private String account;

    @TableField("work")
    private String work;

    @TableField("date")
    private LocalDate date;

    @TableField("left")
    private Float left;

    @TableField("consumed")
    private Float consumed;
}
