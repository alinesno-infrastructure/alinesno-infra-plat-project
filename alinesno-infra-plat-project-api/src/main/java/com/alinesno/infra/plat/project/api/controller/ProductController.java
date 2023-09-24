package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.plat.project.entity.ProductEntity;
import com.alinesno.infra.plat.project.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project_product")
public class ProductController extends BaseController<ProductEntity, ProductService> {
    // 可以添加一些特殊的控制器方法
}
