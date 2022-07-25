package org.epoch.demo.mybatis.repository.impl;


import org.epoch.demo.mybatis.domain.repository.RoleRepository;
import org.epoch.demo.mybatis.repository.entity.Role;
import org.epoch.demo.mybatis.repository.impl.mapper.RoleMapper;
import org.epoch.mybatis.repository.BaseMybatisRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Marshal
 * @date 2019/3/31
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RoleRepositoryImpl extends BaseMybatisRepository<RoleMapper, Role, String> implements RoleRepository {
}
