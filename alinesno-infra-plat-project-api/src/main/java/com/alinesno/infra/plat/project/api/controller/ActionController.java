package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.ActionEntity;
import com.alinesno.infra.plat.project.service.ActionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectActionController是一个RESTful控制器，负责处理与ProjectActionEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectActionService来处理业务逻辑。
 * 所有的请求都映射到"/project_action"路径下。
 */
@RestController
@RequestMapping("/project_action")
public class ActionController extends BaseController<ActionEntity, ActionService> {
}
