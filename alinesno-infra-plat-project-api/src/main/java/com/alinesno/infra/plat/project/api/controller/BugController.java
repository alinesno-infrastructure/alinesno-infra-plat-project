package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.BugEntity;
import com.alinesno.infra.plat.project.service.BugService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectBugController是一个RESTful控制器，负责处理与ProjectBugEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectBugService来处理业务逻辑。
 * 所有的请求都映射到"/projectBug"路径下。
 */
@RestController
@RequestMapping("/projectBug")
public class BugController extends BaseController<BugEntity, BugService> {
}
