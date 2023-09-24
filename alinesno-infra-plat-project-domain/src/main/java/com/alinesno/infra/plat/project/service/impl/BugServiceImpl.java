package com.alinesno.infra.plat.project.service.impl;

import com.alinesno.infra.common.core.service.impl.IBaseServiceImpl;
import com.alinesno.infra.plat.project.api.dto.BugDTO;
import com.alinesno.infra.plat.project.entity.BugEntity;
import com.alinesno.infra.plat.project.mapper.BugMapper;
import com.alinesno.infra.plat.project.service.BugService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BugServiceImpl extends IBaseServiceImpl<BugEntity, BugMapper> implements BugService {
    @Autowired
    private BugMapper bugMapper;

    @Override
    public Page<BugDTO> getBugsByProductId(Long productId, Integer page, Integer limit) {
        // 这里需要你在BugMapper中实现一个方法，根据productId获取所有的bug

        int offset = (page - 1) * limit;
        List<BugEntity> bugEntityList = bugMapper.getBugsByProductId(productId, limit, offset);
        List<BugDTO> bugDTOList = bugEntityList.stream().map(this::convertToDTO).collect(Collectors.toList());

        Page<BugDTO> pageRecord = new Page<>(page, limit, bugDTOList.size());
        pageRecord.setRecords(bugDTOList) ;

        return pageRecord ;
    }

    @Override
    public BugDTO createBug(Long productId, BugDTO bugDTO) {
        BugEntity bugEntity = convertToEntity(bugDTO);
        bugEntity.setProduct(productId);
        bugMapper.insert(bugEntity);
        return convertToDTO(bugEntity);
    }

    @Override
    public BugDTO getBugById(Long bugId) {
        BugEntity bugEntity = bugMapper.selectById(bugId);
        return convertToDTO(bugEntity);
    }

    @Override
    public BugDTO updateBug(Long bugId, BugDTO bugDTO) {
        BugEntity bugEntity = convertToEntity(bugDTO);
        bugEntity.setId(bugId);
        bugMapper.updateById(bugEntity);
        return convertToDTO(bugEntity);
    }

    @Override
    public void deleteBug(Long bugId) {
        bugMapper.deleteById(bugId);
    }

    private BugDTO convertToDTO(BugEntity bugEntity) {
        if (bugEntity == null) {
            return null;
        }
        BugDTO bugDTO = new BugDTO();
        BeanUtils.copyProperties(bugEntity, bugDTO);
        return bugDTO;
    }

    private BugEntity convertToEntity(BugDTO bugDTO) {
        if (bugDTO == null) {
            return null;
        }
        BugEntity bugEntity = new BugEntity();
        BeanUtils.copyProperties(bugDTO, bugEntity);
        return bugEntity;
    }

}
