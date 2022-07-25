package org.epoch.demo.mybatis.domain.service;

import org.epoch.data.service.impl.BaseServiceImpl;

import org.epoch.demo.mybatis.domain.entity.RoleDTO;
import org.epoch.demo.mybatis.domain.repository.RoleRepository;
import org.epoch.demo.mybatis.repository.entity.Role;
import org.springframework.stereotype.Service;

/**
 * @author Marshal
 * @since 2022/7/25
 */
@Service
public class RoleService extends BaseServiceImpl<RoleRepository, RoleDTO, Role, String> {
}
