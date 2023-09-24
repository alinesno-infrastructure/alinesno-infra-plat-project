package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.ModuleEntity;
import com.alinesno.infra.plat.project.service.ModuleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_module")
public class ModuleController extends BaseController<ModuleEntity, ModuleService> {
    // 可以添加一些特殊的控制器方法
}
