package org.epoch.demo.snowflake;

import org.epoch.core.util.ApplicationContextHolder;
import org.epoch.snowflake.helper.SnowflakeHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Marshal
 * @since 2022/7/3
 */
@SpringBootApplication
public class DemoSnowflakeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoSnowflakeApplication.class, args);

        SnowflakeHelper snowflakeHelper = ApplicationContextHolder.getContext().getBean(SnowflakeHelper.class);
        long next = snowflakeHelper.next();
        System.out.println("next key is: " + next);
    }
}
