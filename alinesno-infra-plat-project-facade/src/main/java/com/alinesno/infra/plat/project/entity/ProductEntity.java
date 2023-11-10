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
	@ColumnType(length= 100)
	@ColumnComment("公司ID")
    private Long company;

    /**
     * 产品名称
     */
    @TableField("name")
	@ColumnType(length=50)
	@ColumnComment("产品名称")
    private String name;

    /**
     * 产品代码
     */
    @TableField("code")
	@ColumnType(length= 20)
	@ColumnComment("产品代码")
    private String code;

    /**
     * 产品排序
     */
    @TableField("order")
	@ColumnType(length= 11)
	@ColumnComment("产品排序")
    private Integer order;

    /**
     * 产品状态
     */
    @TableField("status")
	@ColumnType(length=1)
	@ColumnComment("产品状态")
    private String status;

    /**
     * 产品描述
     */
    @TableField("desc")
	@ColumnType(length=255)
	@ColumnComment("产品描述")
    private String desc;
}
