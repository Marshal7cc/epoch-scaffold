package org.epoch.scaffold.jpa.facade.vo;

import java.util.Date;

import lombok.Data;
import org.epoch.web.facade.vo.BaseVO;

/**
 * @author Marshal
 * @since 2022/7/11
 */
@Data
public class RoleVO extends BaseVO {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
