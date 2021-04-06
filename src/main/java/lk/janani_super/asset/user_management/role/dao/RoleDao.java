package lk.janani_super.asset.user_management.role.dao;


import lk.janani_super.asset.user_management.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository< Role, Integer > {
    Role findByRoleName(String roleName);
}
