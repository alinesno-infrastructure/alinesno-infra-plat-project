package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.entity.ProductEntity;
import com.alinesno.infra.plat.project.mapper.ProductMapper;
import com.alinesno.infra.plat.project.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends IBaseServiceImpl<ProductEntity, ProductMapper> implements ProductService {
    // 可以添加一些特殊的服务实现
}
