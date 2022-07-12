package org.epoch.demo.jpa.infrastructure.repository.impl;


import org.epoch.demo.jpa.domain.repository.RoleRepository;
import org.epoch.demo.jpa.infrastructure.repository.entity.Role;
import org.epoch.demo.jpa.infrastructure.repository.RoleJpaRepository;
import org.epoch.jpa.repository.BaseJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marshal
 * @date 2019/3/31
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleRepositoryImpl extends BaseJpaRepository<RoleJpaRepository, Role, String> implements RoleRepository {
}
