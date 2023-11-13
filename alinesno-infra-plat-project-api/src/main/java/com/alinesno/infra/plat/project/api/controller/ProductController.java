package com.alinesno.infra.plat.project.api.controller;


import com.alinesno.infra.common.core.constants.SpringInstanceScope;
import com.alinesno.infra.common.facade.pageable.DatatablesPageBean;
import com.alinesno.infra.common.facade.pageable.TableDataInfo;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.api.dto.ProductDTO;
import com.alinesno.infra.plat.project.entity.ProductEntity;
import com.alinesno.infra.plat.project.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Scope(SpringInstanceScope.PROTOTYPE)
@RequestMapping("/api/infra/plat/project/products")
public class ProductController extends BaseController<ProductEntity, ProductService> {
    // 可以添加一些特殊的控制器方法

        @Autowired
        private ProductService productService;

    /**
     * 获取BusinessLogEntity的DataTables数据。
     *
     * @param request HttpServletRequest对象。
     * @param model Model对象。
     * @param page DatatablesPageBean对象。
     * @return 包含DataTables数据的TableDataInfo对象。
     */
    @ResponseBody
    @PostMapping("/datatables")
    public TableDataInfo datatables(HttpServletRequest request, Model model, DatatablesPageBean page) {
        log.debug("page = {}", ToStringBuilder.reflectionToString(page));
        return this.toPage(model, this.getFeign(), page);
    }

    @Override
    public ProductService getFeign() {
        return this.productService;
    }

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
