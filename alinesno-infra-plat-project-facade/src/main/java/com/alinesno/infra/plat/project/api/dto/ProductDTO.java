package com.alinesno.infra.plat.project.api.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProductDTO {
    private Integer id;
    private Integer program;
    private String name;
    private String code;
    private Integer line;
    private String PO;
    private String QD;
    private String RD;
    private String type;
    private String desc;
    private String acl;
    private List<String> whitelist;
    private String createdBy;
    private LocalDateTime createdDate;
}
