package com.phoenix.common.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 14:45
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String searchValue;

    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updateBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String remark;

    private Map<String, Object> params = new HashMap<>();

}
