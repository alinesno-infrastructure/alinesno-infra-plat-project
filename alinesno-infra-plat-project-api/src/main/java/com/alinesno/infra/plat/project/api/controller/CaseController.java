package com.alinesno.infra.plat.project.api.controller;


import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.rest.BaseController;
import com.alinesno.infra.plat.project.api.dto.CaseDto;
import com.alinesno.infra.plat.project.entity.CaseEntity;
import com.alinesno.infra.plat.project.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ProjectCaseController是一个RESTful控制器，负责处理与ProjectCaseEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectCaseService来处理业务逻辑。
 * 所有的请求都映射到"/projectCase"路径下。
 */
@RestController
@RequestMapping("/products/{productId}")
public class CaseController extends BaseController<CaseEntity, CaseService> {

    @Autowired
    private CaseService service ;

    @GetMapping("/case")
    public AjaxResult getCaseListByProductId(@PathVariable Long productId) {
        return AjaxResult.success(service.getCaseListByProductId(productId));
    }

    @PostMapping("/")
    public AjaxResult createCase(@PathVariable Long productId, @RequestBody CaseDto caseDto) {
        return AjaxResult.success(service.createCase(productId, caseDto));
    }

    @GetMapping("/case/{caseId}")
    public AjaxResult getCaseById(@PathVariable Long caseId) {
        return AjaxResult.success(service.getCaseById(caseId));
    }

    @PutMapping("/case/{caseId}")
    public AjaxResult updateCase(@PathVariable Long caseId, @RequestBody CaseDto caseDto) {
        return AjaxResult.success(service.updateCase(caseId, caseDto));
    }

    @DeleteMapping("/case/{caseId}")
    public AjaxResult deleteCase(@PathVariable Integer caseId) {
        service.deleteCase(caseId);
        return AjaxResult.success();
    }
}

