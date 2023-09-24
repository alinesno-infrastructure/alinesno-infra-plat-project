package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.CaseResultEntity;
import com.alinesno.infra.plat.project.service.CaseResultService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectCaseResultController是一个RESTful控制器，负责处理与ProjectCaseResultEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectCaseResultService来处理业务逻辑。
 * 所有的请求都映射到"/projectCaseResult"路径下。
 */
@RestController
@RequestMapping("/projectCaseResult")
public class CaseResultController extends BaseController<CaseResultEntity, CaseResultService> {
}
