package com.phoenix.framework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author phoenix
 * @version 1.0.0
 * @date 2022/5/10 17:47
 */
@Configuration
public class ShiroConfig {

    /**
     * session超时时间，单位为毫秒，默认30分钟
     */
    @Value("${shiro.session.expireTime}")
    private int expireTime;


}
