package com.alinesno.infra.plat.project.api.controller;


import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.entity.UserEntity;
import com.alinesno.infra.plat.project.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_user")
public class UserController extends BaseController<UserEntity, UserService> {
    // 可以添加一些特殊的控制器方法
}
