package org.epoch.demo.mybatis.infra.repository.impl;


import org.epoch.demo.mybatis.domain.entity.Role;
import org.epoch.demo.mybatis.domain.repository.RoleRepository;
import org.epoch.mybatis.repository.impl.BaseRepositoryImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marshal
 * @date 2019/3/31
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleRepositoryImpl extends BaseRepositoryImpl<Role> implements RoleRepository {
}
