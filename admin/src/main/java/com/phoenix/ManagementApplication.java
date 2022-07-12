package com.phoenix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 * 
 * @author phoenix
 */
@SpringBootApplication()
public class ManagementApplication
{
    public static void main(String[] args)
    {
        /*
          禁止热部署
          禁用重启
          1.在application.properties中设置
          spring.devtools.restart.enabled=false
          在大多数情况下，您可以将此属性设置在application.properties。(这样做仍然会初始化重启类加载器，但它不需要注意。
          文件更改)。
          2.如果您需要完全禁用重新启动支持需要设置spring.devtools.restart.enabled系统属性
          在调用SpringApplication.run之前(…),如以下示例所示:
          System.setProperty("spring.devtools.restart.enabled", "false");
         */

        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ManagementApplication.class, args);
    }
}