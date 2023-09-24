package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.ProjectInfoEntity;
import com.alinesno.infra.plat.project.service.ProjectInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_info")
public class ProjectInfoController extends BaseController<ProjectInfoEntity, ProjectInfoService> {
    // 可以添加一些特殊的控制器方法
}
