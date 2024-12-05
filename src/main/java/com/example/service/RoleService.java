package com.example.service;

import com.example.entity.Role;
import com.example.repositry.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(String roleId) {
        return roleRepository.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
    }

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(String roleId, Role updatedRole) {
        Role existingRole = roleRepository.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
        existingRole.setRoleName(updatedRole.getRoleName());
        existingRole.setPermissionIds(updatedRole.getPermissionIds());
        return roleRepository.save(existingRole);
    }

    public void deleteRole(String roleId) {
        roleRepository.deleteById(roleId);
    }
}

