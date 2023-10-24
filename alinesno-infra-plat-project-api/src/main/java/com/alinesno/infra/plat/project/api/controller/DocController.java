package com.alinesno.infra.plat.project.api.controller;


import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.entity.DocEntity;
import com.alinesno.infra.plat.project.service.DocService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProjectDocController是一个RESTful控制器，负责处理与ProjectDocEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectDocService来处理业务逻辑。
 * 所有的请求都映射到"/projectDoc"路径下。
 */
@RestController
@RequestMapping("/projectDoc")
public class DocController extends BaseController<DocEntity, DocService> {
}
