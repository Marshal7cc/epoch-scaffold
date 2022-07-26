package org.epoch.scaffold.jpa.domain.service;

import org.epoch.data.service.impl.BaseServiceImpl;
import org.epoch.scaffold.jpa.domain.entity.RoleDO;
import org.epoch.scaffold.jpa.domain.repository.RoleRepository;
import org.epoch.scaffold.jpa.infrastructure.repository.entity.RoleJpaEntity;
import org.springframework.stereotype.Service;

/**
 * @author Marshal
 * @since 2022/7/25
 */
@Service
public class RoleService extends BaseServiceImpl<RoleRepository, RoleDO, RoleJpaEntity, String> {
}
