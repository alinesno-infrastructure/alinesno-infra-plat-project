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

import java.time.LocalDate;

/**
 * UserEntity实体类，对应于数据库中的project_user表。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("project_user")
public class UserEntity extends BaseEntity {
    /**
     * 公司ID
     */
    @TableField("company")
	@ColumnType(length= 100)
	@ColumnComment("公司ID")
    private Long company;

    /**
     * 部门ID
     */
    @TableField("division")
	@ColumnType(length=50)
	@ColumnComment("部门ID")
    private Long division;

    /**
     * 用户账号
     */
    @TableField("account")
	@ColumnType(length=50)
	@ColumnComment("用户账号")
    private String account;

    /**
     * 用户密码
     */
    @TableField("password")
	@ColumnType(length= 255)
	@ColumnComment("用户密码")
    private String password;

    /**
     * 用户真实姓名
     */
    @TableField("real_name")
	@ColumnType(length= 50)
	@ColumnComment("用户真实姓名")
    private String realName;

    /**
     * 用户昵称
     */
    @TableField("nick_name")
	@ColumnType(length= 50)
	@ColumnComment("用户昵称")
    private String nickName;

    /**
     * 用户头像
     */
    @TableField("avatar")
	@ColumnType(length=255)
	@ColumnComment("用户头像")
    private String avatar;

    /**
     * 用户出生年份
     */
    @TableField("birth_year")
	@ColumnType(length=4)
	@ColumnComment("用户出生年份")
    private Integer birthYear;

    /**
     * 用户生日
     */
    @TableField("birthday")
	@ColumnType(length=10)
	@ColumnComment("用户生日")
    private LocalDate birthday;

    /**
     * 用户性别
     */
    @TableField("gender")
	@ColumnType(length=1)
	@ColumnComment("用户性别")
    private String gender;

    /**
     * 用户电子邮件
     */
    @TableField("email")
	@ColumnType(length= 255)
	@ColumnComment("用户电子邮件")
    private String email;

    /**
     * 用户MSN账号
     */
    @TableField("msn")
	@ColumnType(length=255)
	@ColumnComment("用户MSN账号")
    private String msn;

    /**
     * 用户QQ账号
     */
    @TableField("qq")
	@ColumnType(length= 20)
	@ColumnComment("用户QQ账号")
    private String qq;

    /**
     * 用户雅虎通账号
     */
    @TableField("yahoo")
	@ColumnType(length=255)
	@ColumnComment("用户雅虎通账号")
    private String yahoo;

    /**
     * 用户谷歌通账号
     */
    @TableField("gtalk")
	@ColumnType(length=50)
	@ColumnComment("用户谷歌通账号")
    private String gtalk;

    /**
     * 用户旺旺账号
     */
    @TableField("wangwang")
	@ColumnType(length= 20)
	@ColumnComment("用户旺旺账号")
    private String wangwang;

    /**
     * 用户移动电话
     */
    @TableField("mobile")
	@ColumnType(length= 20)
	@ColumnComment("用户移动电话")
    private String mobile;

    /**
     * 用户电话
     */
    @TableField("phone")
	@ColumnType(length=15)
	@ColumnComment("用户电话")
    private String phone;

    /**
     * 用户地址
     */
    @TableField("address")
	@ColumnType(length=255)
	@ColumnComment("用户地址")
    private String address;

    /**
     * 用户邮编
     */
    @TableField("zipcode")
	@ColumnType(length=10)
	@ColumnComment("用户邮编")
    private String zipcode;

    /**
     * 用户加入日期
     */
    @TableField("join")
	@ColumnType(length=255)
	@ColumnComment("用户加入日期")
    private LocalDate join;

    /**
     * 用户访问次数
     */
    @TableField("visits")
	@ColumnType(length=10)
	@ColumnComment("用户访问次数")
    private Long visits;

    /**
     * 用户IP地址
     */
    @TableField("ip")
	@ColumnType(length=15)
	@ColumnComment("用户IP地址")
    private String ip;

    /**
     * 用户最后访问时间
     */
    @TableField("last")
	@ColumnType(length= 50)
	@ColumnComment("用户最后访问时间")
    private Long last;
}
