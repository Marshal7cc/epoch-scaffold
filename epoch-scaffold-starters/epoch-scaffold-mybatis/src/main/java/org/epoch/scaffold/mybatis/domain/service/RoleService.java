package org.epoch.scaffold.mybatis.domain.service;

import org.epoch.data.service.impl.BaseServiceImpl;

import org.epoch.scaffold.mybatis.domain.entity.RoleDO;
import org.epoch.scaffold.mybatis.domain.repository.RoleRepository;
import org.epoch.scaffold.mybatis.repository.entity.Role;
import org.springframework.stereotype.Service;

/**
 * @author Marshal
 * @since 2022/7/25
 */
@Service
public class RoleService extends BaseServiceImpl<RoleRepository, RoleDO, Role, String> {
}
