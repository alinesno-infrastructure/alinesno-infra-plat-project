package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.core.rest.BaseController;
import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.plat.project.api.dto.BugDTO;
import com.alinesno.infra.plat.project.entity.BugEntity;
import com.alinesno.infra.plat.project.service.BugService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * ProjectBugController是一个RESTful控制器，负责处理与ProjectBugEntity相关的HTTP请求。
 * 它继承自BaseController，并使用ProjectBugService来处理业务逻辑。
 * 所有的请求都映射到"/projectBug"路径下。
 */
@RestController
@RequestMapping("/products/{productId}/bugs")
public class BugController {

    @Autowired
    private BugService bugService;

    // 获取产品Bug列表
    @GetMapping
    public AjaxResult getBugs(@PathVariable Long productId, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer limit) {
        Page<BugDTO> bugPage = bugService.getBugsByProductId(productId, page, limit);
        return AjaxResult.success(bugPage);
    }

    // 创建Bug
    @PostMapping
    public AjaxResult createBug(@PathVariable Long productId, @RequestBody BugDTO bugDTO) {
        BugDTO createdBug = bugService.createBug(productId, bugDTO);
        return AjaxResult.success(createdBug);
    }

    // 获取Bug详情
    @GetMapping("/{bugId}")
    public AjaxResult getBugById(@PathVariable Long bugId) {
        BugDTO bugDTO = bugService.getBugById(bugId);
        return AjaxResult.success(bugDTO);
    }

    // 修改Bug
    @PutMapping("/{bugId}")
    public AjaxResult updateBug(@PathVariable Long bugId, @RequestBody BugDTO bugDTO) {
        BugDTO updatedBug = bugService.updateBug(bugId, bugDTO);
        return AjaxResult.success(updatedBug);
    }

    // 删除Bug
    @DeleteMapping("/{bugId}")
    public AjaxResult deleteBug(@PathVariable Long bugId) {
        bugService.deleteBug(bugId);
        return AjaxResult.success();
    }
}
