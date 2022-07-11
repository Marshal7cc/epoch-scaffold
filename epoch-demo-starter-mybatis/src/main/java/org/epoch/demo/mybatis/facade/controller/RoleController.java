package org.epoch.demo.mybatis.facade.controller;


import org.epoch.demo.mybatis.domain.repository.RoleRepository;
import org.epoch.demo.mybatis.facade.dto.RoleDTO;
import org.epoch.demo.mybatis.facade.query.RoleQuery;
import org.epoch.demo.mybatis.facade.vo.RoleVO;
import org.epoch.demo.mybatis.repository.entity.Role;
import org.epoch.web.facade.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @since 2021/8/26
 */
@RestController
@RequestMapping("/api/v1/roles")
public class RoleController extends BaseController<RoleRepository, RoleDTO, RoleVO, RoleQuery, Role, String> {

}
