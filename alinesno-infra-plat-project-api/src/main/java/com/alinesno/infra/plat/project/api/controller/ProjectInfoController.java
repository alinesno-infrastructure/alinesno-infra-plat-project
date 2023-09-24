package com.alinesno.infra.plat.project.api.controller;

import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.plat.project.entity.ProjectInfoEntity;
import com.alinesno.infra.plat.project.service.ProjectInfoService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projects")
public class ProjectInfoController {
    @Autowired
    private ProjectInfoService projectInfoService;

    // 获取项目列表
    @GetMapping
    public AjaxResult getProjects(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "20") int limit) {
        Page<ProjectInfoEntity> projectPage = projectInfoService.getProjects(page, limit);
        return AjaxResult.success(projectPage);
    }

    // 创建项目
    @PostMapping
    public AjaxResult createProject(@RequestBody ProjectInfoEntity projectInfoEntity) {
        ProjectInfoEntity createdProject = projectInfoService.createProject(projectInfoEntity);
        return AjaxResult.success(createdProject);
    }

    // 获取项目详情
    @GetMapping("/{id}")
    public AjaxResult getProjectById(@PathVariable Long id) {
        ProjectInfoEntity projectInfoEntity = projectInfoService.getProjectById(id);
        return AjaxResult.success(projectInfoEntity);
    }

    // 修改项目
    @PutMapping("/{id}")
    public AjaxResult updateProject(@PathVariable Long id, @RequestBody ProjectInfoEntity projectInfoEntity) {
        ProjectInfoEntity updatedProject = projectInfoService.updateProject(id, projectInfoEntity);
        return AjaxResult.success(updatedProject);
    }

    // 删除项目
    @DeleteMapping("/{id}")
    public AjaxResult deleteProject(@PathVariable Long id) {
        projectInfoService.deleteProject(id);
        return AjaxResult.success();
    }
}
