package org.epoch.scaffold.mybatis.facade.controller;


import org.epoch.scaffold.mybatis.domain.entity.RoleDO;
import org.epoch.scaffold.mybatis.domain.service.RoleService;
import org.epoch.scaffold.mybatis.facade.query.RoleQuery;
import org.epoch.scaffold.mybatis.facade.vo.RoleVO;
import org.epoch.web.facade.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @since 2021/8/26
 */
@RestController
@RequestMapping("/api/v1/roles")
public class RoleController extends BaseController<RoleService, RoleVO, RoleQuery, RoleDO, String> {

}
