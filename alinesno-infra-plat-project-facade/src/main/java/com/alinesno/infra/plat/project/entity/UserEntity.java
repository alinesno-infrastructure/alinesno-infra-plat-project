package com.alinesno.infra.plat.project.entity;

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
    private Long company;

    /**
     * 部门ID
     */
    @TableField("division")
    private Long division;

    /**
     * 用户账号
     */
    @TableField("account")
    private String account;

    /**
     * 用户密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户真实姓名
     */
    @TableField("realname")
    private String realname;

    /**
     * 用户昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 用户头像
     */
    @TableField("avatar")
    private String avatar;

    /**
     * 用户出生年份
     */
    @TableField("birthyear")
    private Integer birthyear;

    /**
     * 用户生日
     */
    @TableField("birthday")
    private LocalDate birthday;

    /**
     * 用户性别
     */
    @TableField("gender")
    private String gender;

    /**
     * 用户电子邮件
     */
    @TableField("email")
    private String email;

    /**
     * 用户MSN账号
     */
    @TableField("msn")
    private String msn;

    /**
     * 用户QQ账号
     */
    @TableField("qq")
    private String qq;

    /**
     * 用户雅虎通账号
     */
    @TableField("yahoo")
    private String yahoo;

    /**
     * 用户谷歌通账号
     */
    @TableField("gtalk")
    private String gtalk;

    /**
     * 用户旺旺账号
     */
    @TableField("wangwang")
    private String wangwang;

    /**
     * 用户移动电话
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 用户电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户地址
     */
    @TableField("address")
    private String address;

    /**
     * 用户邮编
     */
    @TableField("zipcode")
    private String zipcode;

    /**
     * 用户加入日期
     */
    @TableField("join")
    private LocalDate join;

    /**
     * 用户访问次数
     */
    @TableField("visits")
    private Long visits;

    /**
     * 用户IP地址
     */
    @TableField("ip")
    private String ip;

    /**
     * 用户最后访问时间
     */
    @TableField("last")
    private Long last;
}
