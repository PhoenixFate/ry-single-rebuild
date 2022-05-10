package com.phoenix.framework.config;

import com.phoenix.framework.shiro.web.filter.captcha.CaptchaValidateFilter;
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

    /**
     * 验证码类型
     */
    @Value("${shiro.user.captchaType}")
    private String captchaType;

    /**
     * 验证码开关
     */
    @Value("${shiro.user.captchaEnabled}")
    private boolean captchaEnabled;


    /**
     * 自定义验证码过滤器
     */
    public CaptchaValidateFilter captchaValidateFilter()
    {
        CaptchaValidateFilter captchaValidateFilter = new CaptchaValidateFilter();
        captchaValidateFilter.setCaptchaEnabled(captchaEnabled);
        captchaValidateFilter.setCaptchaType(captchaType);
        return captchaValidateFilter;
    }
}
