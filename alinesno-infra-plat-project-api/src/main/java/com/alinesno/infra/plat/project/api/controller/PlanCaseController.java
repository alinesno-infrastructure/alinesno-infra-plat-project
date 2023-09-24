package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.PlanCaseEntity;
import com.alinesno.infra.plat.project.service.PlanCaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_plan_case")
public class PlanCaseController extends BaseController<PlanCaseEntity, PlanCaseService> {
    // 可以添加一些特殊的控制器方法
}
