package org.epoch.demo.mybatis.api.controller;

import java.util.LinkedList;
import java.util.List;

import org.epoch.core.rest.Response;
import org.epoch.core.rest.ResponseEntity;
import org.epoch.demo.mybatis.domain.entity.Role;
import org.epoch.demo.mybatis.domain.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marshal
 * @since 2021/8/26
 */
@RestController
@RequestMapping("/api/v1/roles")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/parallel-save")
    public ResponseEntity<Void> test() {
        List<Role> roles = new LinkedList<Role>();
        for (int i = 0; i < 10; i++) {
            Role role = new Role();
            role.setCode(String.valueOf(i));
//            if (i == 1) {
//                role.setCode("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//            }
            role.setName(String.valueOf(i));
            roles.add(role);
        }
        roleRepository.parallelSave(roles, 3);
        return Response.success();
    }
}
