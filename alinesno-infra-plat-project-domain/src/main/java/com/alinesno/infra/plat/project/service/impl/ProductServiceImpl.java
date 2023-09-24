package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.api.dto.ProductDTO;
import com.alinesno.infra.plat.project.entity.ProductEntity;
import com.alinesno.infra.plat.project.mapper.ProductMapper;
import com.alinesno.infra.plat.project.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl extends IBaseServiceImpl<ProductEntity, ProductMapper> implements ProductService {
    // 可以添加一些特殊的服务实现

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductEntity> productEntities = productMapper.selectList(null);
        return productEntities.stream()
                .map(product -> modelMapper.map(product, ProductDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
        ProductEntity productEntity = modelMapper.map(productDTO, ProductEntity.class);
        productMapper.insert(productEntity);
        return modelMapper.map(productEntity, ProductDTO.class);
    }

    @Override
    public ProductDTO getProductById(Integer id) {
        ProductEntity productEntity = productMapper.selectById(id);
        return modelMapper.map(productEntity, ProductDTO.class);
    }

    @Override
    public ProductDTO updateProduct(Integer id, ProductDTO productDTO) {
        ProductEntity productEntity = productMapper.selectById(id);
        if (productEntity == null) {
            throw new RuntimeException("Product not found");
        }
        BeanUtils.copyProperties(productDTO, productEntity);
        productMapper.updateById(productEntity);
        return modelMapper.map(productEntity, ProductDTO.class);
    }

    @Override
    public void deleteProduct(Integer id) {
        productMapper.deleteById(id);
    }
}
