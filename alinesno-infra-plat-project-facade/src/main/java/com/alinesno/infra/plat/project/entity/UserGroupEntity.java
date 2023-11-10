package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * UserGroupEntity实体类，对应于数据库中的project_user_group表。
 * 包含account和group两个字段，分别对应于用户账号和用户组别。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_user_group")
public class UserGroupEntity extends BaseEntity {
    /**
     * 用户账号
     */
    @TableField("account")
	@ColumnType(length= 50)
	@ColumnComment("用户账号")
    private String account;

    /**
     * 用户组别
     */
    @TableField("group")
	@ColumnType(length=50)
	@ColumnComment("用户组别")
    private Long group;
}
