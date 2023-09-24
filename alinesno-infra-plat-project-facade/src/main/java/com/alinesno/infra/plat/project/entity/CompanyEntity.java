package com.alinesno.infra.plat.project.entity;

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
    private String name;

    /**
     * 公司电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 公司传真
     */
    @TableField("fax")
    private String fax;

    /**
     * 公司地址
     */
    @TableField("address")
    private String address;

    /**
     * 邮编
     */
    @TableField("zipcode")
    private String zipcode;

    /**
     * 公司网站
     */
    @TableField("website")
    private String website;

    /**
     * 后院
     */
    @TableField("backyard")
    private String backyard;

    /**
     * 项目管理系统
     */
    @TableField("pms")
    private String pms;

    /**
     * 客人
     */
    @TableField("guest")
    private String guest;

    /**
     * 管理员
     */
    @TableField("admins")
    private String admins;
}
