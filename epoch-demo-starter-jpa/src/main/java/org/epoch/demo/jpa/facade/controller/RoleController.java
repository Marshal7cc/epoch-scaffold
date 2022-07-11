package org.epoch.demo.jpa.facade.controller;


import org.epoch.demo.jpa.domain.repository.RoleRepository;
import org.epoch.demo.jpa.repository.entity.Role;
import org.epoch.demo.jpa.facade.dto.RoleDTO;
import org.epoch.demo.jpa.facade.query.RoleQuery;
import org.epoch.demo.jpa.facade.vo.RoleVO;
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
