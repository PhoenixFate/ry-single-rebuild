package com.phoenix.common.core.domain.entity;

import com.phoenix.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 15:06
 */
@Data
public class SysDept extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long deptId;

    private Long parentId;

    private String ancestors;

    private String deptName;

    private Integer orderNumber;

    private String leader;

    private String phone;

    private String email;

    private String status;

    private String deleteFlag;

    private String parentName;

    private Long excludeId;

}
