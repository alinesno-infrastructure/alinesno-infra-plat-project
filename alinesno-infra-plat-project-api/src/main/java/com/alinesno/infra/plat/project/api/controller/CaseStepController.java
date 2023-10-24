package com.alinesno.infra.plat.project.api.controller;


import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.entity.CaseStepEntity;
import com.alinesno.infra.plat.project.service.CaseStepService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectCaseStepController是一个RESTful控制器，负责处理与ProjectCaseStepEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectCaseStepService来处理业务逻辑。
 * 所有的请求都映射到"/projectCaseStep"路径下。
 */
@RestController
@RequestMapping("/projectCaseStep")
public class CaseStepController extends BaseController<CaseStepEntity, CaseStepService> {
}
