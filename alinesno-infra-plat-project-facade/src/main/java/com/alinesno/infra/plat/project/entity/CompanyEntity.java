package com.alinesno.infra.plat.project.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnComment;
import com.gitee.sunchenbin.mybatis.actable.annotation.ColumnType;
import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * CompanyEntity实体类，对应于数据库中的project_company表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_company")
public class CompanyEntity extends BaseEntity {
    /**
     * 公司名称
     */
    @TableField("name")
	@ColumnType(length= 50)
	@ColumnComment("公司名称")
    private String name;

    /**
     * 公司电话
     */
    @TableField("phone")
	@ColumnType(length=10)
	@ColumnComment("公司电话")
    private String phone;

    /**
     * 公司传真
     */
    @TableField("fax")
	@ColumnType(length=50)
	@ColumnComment("公司传真")
    private String fax;

    /**
     * 公司地址
     */
    @TableField("address")
	@ColumnType(length=255)
	@ColumnComment("公司地址")
    private String address;

    /**
     * 邮编
     */
    @TableField("zipcode")
	@ColumnType(length= 10)
	@ColumnComment("邮编")
    private String zipcode;

    /**
     * 公司网站
     */
    @TableField("website")
	@ColumnType(length=255)
	@ColumnComment("公司网站")
    private String website;

    /**
     * 后院
     */
    @TableField("backyard")
	@ColumnType(length= 50)
	@ColumnComment("后院")
    private String backyard;

    /**
     * 项目管理系统
     */
    @TableField("pms")
	@ColumnType(length= 50)
	@ColumnComment("项目管理系统")
    private String pms;

    /**
     * 客人
     */
    @TableField("guest")
	@ColumnType(length=255)
	@ColumnComment("客人")
    private String guest;

    /**
     * 管理员
     */
    @TableField("admins")
	@ColumnType(length=50)
	@ColumnComment("管理员")
    private String admins;
}
