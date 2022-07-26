package org.epoch.scaffold.jpa.infrastructure.repository;

import org.epoch.scaffold.jpa.infrastructure.repository.entity.RoleJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marshal
 * @since 2022/7/11
 */
public interface RoleJpaRepository extends JpaRepository<RoleJpaEntity, String> {
}
