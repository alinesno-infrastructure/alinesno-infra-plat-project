package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.UserGroupEntity;
import com.alinesno.infra.plat.project.service.UserGroupService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_user_group")
public class UserGroupController extends BaseController<UserGroupEntity, UserGroupService> {
    // 可以添加一些特殊的控制器方法
}
