package com.alinesno.infra.plat.project.service;

import com.alinesno.infra.common.facade.services.IBaseService;
import com.alinesno.infra.plat.project.api.dto.ProductDTO;
import com.alinesno.infra.plat.project.entity.ProductEntity;

import java.util.List;

public interface ProductService extends IBaseService<ProductEntity> {
    // 可以添加一些特殊的服务方法
    List<ProductDTO> getAllProducts();
    ProductDTO createProduct(ProductDTO productDTO);
    ProductDTO getProductById(Integer id);
    ProductDTO updateProduct(Integer id, ProductDTO productDTO);
    void deleteProduct(Integer id);
}
