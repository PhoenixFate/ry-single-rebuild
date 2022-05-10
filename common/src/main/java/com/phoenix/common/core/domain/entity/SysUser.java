package com.phoenix.common.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.phoenix.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 14:57
 */
@Data
public class SysUser extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private Long deptId;

    /**
     * 部门父ID
     */
    private Long parentId;

    private Long roleId;

    private String loginName;

    private String userName;

    private String userType;

    private String email;

    private String phoneNumber;

    /**
     * 0=男,1=女,2=未知
     */
    private String sex;

    private String avatar;

    private String password;

    private String salt;

    /** 帐号状态（0正常 1停用） */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String deleteFlag;

    private String loginIp;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date loginDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date passwordUpdateDate;

    private SysDept dept;

    private List<SysRole> roles;

    private Long[] rolesIds;

    private Long[] postIds;

}
