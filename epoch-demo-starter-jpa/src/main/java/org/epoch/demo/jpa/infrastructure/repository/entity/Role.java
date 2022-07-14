package org.epoch.demo.jpa.infrastructure.repository.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import org.epoch.jpa.domain.BaseAuditEntity;

/**
 * @author Marshal
 */
@Data
@Entity
@Table(name = "sys_role")
public class Role extends BaseAuditEntity<String> {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
