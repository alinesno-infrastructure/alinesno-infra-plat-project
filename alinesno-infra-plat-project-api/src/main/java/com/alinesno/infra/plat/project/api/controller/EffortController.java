package com.alinesno.infra.plat.project.api.controller;


import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.entity.EffortEntity;
import com.alinesno.infra.plat.project.service.EffortService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectEffortController是一个RESTful控制器，负责处理与ProjectEffortEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectEffortService来处理业务逻辑。
 * 所有的请求都映射到"/projectEffort"路径下。
 */
@RestController
@RequestMapping("/projectEffort")
public class EffortController extends BaseController<EffortEntity, EffortService> {
}
