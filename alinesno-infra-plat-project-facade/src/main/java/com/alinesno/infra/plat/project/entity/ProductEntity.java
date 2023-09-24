package com.alinesno.infra.plat.project.entity;

import com.alinesno.infra.common.facade.mapper.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * ProductEntity实体类，对应于数据库中的project_product表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_product")
public class ProductEntity extends BaseEntity {
    /**
     * 公司ID
     */
    @TableField("company")
    private Long company;

    /**
     * 产品名称
     */
    @TableField("name")
    private String name;

    /**
     * 产品代码
     */
    @TableField("code")
    private String code;

    /**
     * 产品排序
     */
    @TableField("order")
    private Integer order;

    /**
     * 产品状态
     */
    @TableField("status")
    private String status;

    /**
     * 产品描述
     */
    @TableField("desc")
    private String desc;
}
