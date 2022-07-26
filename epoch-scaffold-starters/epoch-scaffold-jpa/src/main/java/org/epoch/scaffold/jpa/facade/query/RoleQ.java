package org.epoch.scaffold.jpa.facade.query;

import java.util.Date;

import lombok.Data;
import org.epoch.web.facade.query.BaseQuery;

/**
 * @author Marshal
 * @since 2022/7/11
 */
@Data
public class RoleQ extends BaseQuery {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
