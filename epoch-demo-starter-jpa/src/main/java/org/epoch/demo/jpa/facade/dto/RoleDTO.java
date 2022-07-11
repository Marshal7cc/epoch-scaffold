package org.epoch.demo.jpa.facade.dto;

import java.util.Date;

import lombok.Data;
import org.epoch.web.facade.dto.BaseDTO;

/**
 * @author Marshal
 * @since 2022/7/11
 */
@Data
public class RoleDTO extends BaseDTO {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
