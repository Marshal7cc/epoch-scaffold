package org.epoch.demo.jpa.infrastructure.repository;

import org.epoch.demo.jpa.infrastructure.repository.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marshal
 * @since 2022/7/11
 */
public interface RoleJpaRepository extends JpaRepository<Role, String> {
}
