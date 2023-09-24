package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.CaseEntity;
import com.alinesno.infra.plat.project.service.CaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectCaseController是一个RESTful控制器，负责处理与ProjectCaseEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectCaseService来处理业务逻辑。
 * 所有的请求都映射到"/projectCase"路径下。
 */
@RestController
@RequestMapping("/projectCase")
public class CaseController extends BaseController<CaseEntity, CaseService> {
}
