package com.phoenix.common.core.domain.entity;

import com.phoenix.common.core.domain.BaseEntity;
import lombok.Data;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 15:09
 */
@Data
public class SysRole extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long roleId;

    private String roleName;

    private String roleKey;

    private String roleSort;

    /** 数据范围（1：所有数据权限；2：自定义数据权限；3：本部门数据权限；4：本部门及以下数据权限；5：仅本人数据权限） */
    private String dataScope;

    private String status;

    private String deleteFlag;

    /** 用户是否存在此角色标识 默认不存在 */

    private Boolean flag=false;

    private Long[] menuIds;

    private Long[] deptIds;

}
