package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.entity.CompanyEntity;
import com.alinesno.infra.plat.project.service.CompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_company")
public class CompanyController extends BaseController<CompanyEntity, CompanyService> {
    // 可以添加一些特殊的控制器方法
}
