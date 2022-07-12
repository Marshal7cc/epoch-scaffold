package org.epoch.demo.jpa.infrastructure.repository.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import org.epoch.jpa.annotation.LogicDelete;
import org.epoch.jpa.domain.BaseAuditEntity;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 * @author Marshal
 */
@Data
@Entity
@Table(name = "sys_role")
@Where(clause = "status = '1'")
@SQLDelete(sql = "update role set status = '0' where id = ? ")
public class Role extends BaseAuditEntity<String> {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
