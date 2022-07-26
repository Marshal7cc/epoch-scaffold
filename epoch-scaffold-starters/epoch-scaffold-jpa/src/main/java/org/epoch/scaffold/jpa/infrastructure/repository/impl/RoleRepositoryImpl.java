package org.epoch.scaffold.jpa.infrastructure.repository.impl;


import org.epoch.scaffold.jpa.domain.repository.RoleRepository;
import org.epoch.scaffold.jpa.infrastructure.repository.entity.RoleJpaEntity;
import org.epoch.scaffold.jpa.infrastructure.repository.RoleJpaRepository;
import org.epoch.jpa.repository.BaseJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marshal
 * @date 2019/3/31
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleRepositoryImpl extends BaseJpaRepository<RoleJpaRepository, RoleJpaEntity, String> implements RoleRepository {
}
