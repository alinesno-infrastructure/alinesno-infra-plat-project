package com.alinesno.infra.plat.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 集成一个Java开发示例工具
 * @author LuoAnDong
 * @since 2023年8月3日 上午6:23:43
 */
@MapperScan("com.alinesno.infra.plat.project.mapper")
@SpringBootApplication
public class PlatProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatProjectApplication.class, args);
    }

}