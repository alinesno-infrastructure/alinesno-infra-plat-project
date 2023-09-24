package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.plat.project.api.dto.ProductDTO;
import com.alinesno.infra.plat.project.entity.ProductEntity;
import com.alinesno.infra.plat.project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController extends BaseController<ProductEntity, ProductService> {
    // 可以添加一些特殊的控制器方法

        @Autowired
        private ProductService productService;

        // 获取产品列表
        @GetMapping
        public AjaxResult getProducts() {
            List<ProductDTO> products = productService.getAllProducts();
            return AjaxResult.success(products);
        }

        // 创建产品
        @PostMapping
        public AjaxResult createProduct(@RequestBody ProductDTO productDTO) {
            ProductDTO createdProduct = productService.createProduct(productDTO);
            return AjaxResult.success(createdProduct);
        }

        // 获取产品详情
        @GetMapping("/{id}")
        public AjaxResult getProduct(@PathVariable Integer id) {
            ProductDTO product = productService.getProductById(id);
            return AjaxResult.success(product);
        }

        // 编辑产品
        @PutMapping("/{id}")
        public AjaxResult updateProduct(@PathVariable Integer id, @RequestBody ProductDTO productDTO) {
            ProductDTO updatedProduct = productService.updateProduct(id, productDTO);
            return AjaxResult.success(updatedProduct);
        }

        // 删除产品
        @DeleteMapping("/{id}")
        public AjaxResult deleteProduct(@PathVariable Integer id) {
            productService.deleteProduct(id);
            return AjaxResult.success();
        }
    }
