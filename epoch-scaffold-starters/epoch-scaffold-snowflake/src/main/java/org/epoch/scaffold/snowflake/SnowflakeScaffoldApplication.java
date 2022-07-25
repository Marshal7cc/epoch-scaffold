package org.epoch.scaffold.snowflake;

import org.epoch.core.util.ApplicationContextHelper;
import org.epoch.snowflake.helper.SnowflakeHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Marshal
 * @since 2022/7/3
 */
@SpringBootApplication
public class SnowflakeScaffoldApplication {
    public static void main(String[] args) {
        SpringApplication.run(SnowflakeScaffoldApplication.class, args);

        SnowflakeHelper snowflakeHelper = ApplicationContextHelper.getContext().getBean(SnowflakeHelper.class);
        long next = snowflakeHelper.next();
        System.out.println("next key is: " + next);
    }
}
