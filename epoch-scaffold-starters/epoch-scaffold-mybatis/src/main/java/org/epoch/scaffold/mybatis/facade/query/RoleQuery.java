package org.epoch.scaffold.mybatis.facade.query;

import java.util.Date;

import lombok.Data;
import org.epoch.web.facade.query.BaseQuery;

/**
 * @author Marshal
 * @since 2022/7/11
 */
@Data
public class RoleQuery extends BaseQuery {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
