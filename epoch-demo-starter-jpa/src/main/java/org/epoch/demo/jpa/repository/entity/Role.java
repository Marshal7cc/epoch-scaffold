package org.epoch.demo.jpa.repository.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import org.epoch.jpa.domain.BaseAuditEntity;

/**
 * @author Marshal
 */
@Data
@Entity(name = "sys_role")
public class Role extends BaseAuditEntity<String> {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
    @Id
    @GeneratedValue
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
