package org.epoch.demo.mybatis;

import org.epoch.web.annotation.EpochApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

/**
 * @author Marshal
 * @since 2021/8/26
 */
@EpochApplication
@MapperScan("org.epoch.**.mapper")
public class DemoMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);
    }
}
