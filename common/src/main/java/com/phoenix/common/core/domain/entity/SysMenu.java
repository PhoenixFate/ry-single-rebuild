package com.phoenix.common.core.domain.entity;

import com.phoenix.common.core.domain.BaseEntity;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 15:12
 */
@Data
public class SysMenu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long menuId;

    private String menuName;

    private String parentName;

    private Long parentId;

    private String orderNumber;

    private String url;

    private String target;

    private String menuType;

    private String visible;

    private String isRefresh;

    private String permissions;

    private String icon;

    private List<SysMenu> children = new ArrayList<>();

}
