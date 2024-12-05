package com.example.service;

import com.example.entity.Permission;
import com.example.repositry.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public List<Permission> getAllPermissions() {
        return permissionRepository.findAll();
    }

    public Permission getPermissionById(String permissionId) {
        return permissionRepository.findById(permissionId).orElseThrow(() -> new RuntimeException("Permission not found"));
    }

    public Permission createPermission(Permission permission) {
        return permissionRepository.save(permission);
    }

    public Permission updatePermission(String permissionId, Permission updatedPermission) {
        Permission existingPermission = permissionRepository.findById(permissionId).orElseThrow(() -> new RuntimeException("Permission not found"));
        existingPermission.setPermissionName(updatedPermission.getPermissionName());
        return permissionRepository.save(existingPermission);
    }

    public void deletePermission(String permissionId) {
        permissionRepository.deleteById(permissionId);
    }
}
