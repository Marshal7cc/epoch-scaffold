package org.epoch.scaffold.jpa.facade.controller;


import org.epoch.scaffold.jpa.domain.entity.RoleDO;
import org.epoch.scaffold.jpa.domain.service.RoleService;
import org.epoch.scaffold.jpa.facade.query.RoleQ;
import org.epoch.scaffold.jpa.facade.vo.RoleVo;
import org.epoch.web.facade.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @since 2021/8/26
 */
@RestController
@RequestMapping("/api/v1/roles")
public class RoleController extends BaseController<RoleService, RoleVo, RoleQ, RoleDO, String> {

}
