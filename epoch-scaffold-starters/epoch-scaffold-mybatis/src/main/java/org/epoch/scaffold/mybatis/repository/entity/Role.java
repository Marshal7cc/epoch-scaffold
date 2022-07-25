package org.epoch.scaffold.mybatis.repository.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.epoch.mybatis.domain.BaseAuditEntity;

/**
 * @author Marshal
 */
@Data
@TableName("sys_role")
public class Role extends BaseAuditEntity<Role, String> {
    private String code;
    private String name;
    private String description;
    private Date startActiveDate;
    private Date endActiveDate;
}
