package org.epoch.scaffold.core;

import org.epoch.core.util.ApplicationContextHelper;
import org.epoch.core.util.GenericTypeConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Marshal
 * @since 2022/7/25
 */
@SpringBootApplication
public class CoreScaffoldApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreScaffoldApplication.class, args);

        ApplicationContextHelper.getContext().getBean(GenericTypeConverter.class);
        ApplicationContextHelper.getContext().getBean(ApplicationContextHelper.class);
    }
}
