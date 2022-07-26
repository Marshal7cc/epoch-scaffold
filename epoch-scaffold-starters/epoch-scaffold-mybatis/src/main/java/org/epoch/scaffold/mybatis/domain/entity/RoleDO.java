package org.epoch.scaffold.mybatis.domain.entity;

import java.util.Date;

import lombok.Data;
import org.epoch.data.domain.BaseDO;

/**
 * @author Marshal
 * @since 2022/7/11
 */
@Data
public class RoleDO extends BaseDO<String> {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;

}
