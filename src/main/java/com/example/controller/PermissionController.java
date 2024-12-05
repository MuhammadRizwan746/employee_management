package com.example.controller;
import com.example.entity.Permission;
import com.example.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping
    public List<Permission> getAllPermissions() {
        return permissionService.getAllPermissions();
    }

    @GetMapping("/{permissionId}")
    public Permission getPermissionById(@PathVariable String permissionId) {
        return permissionService.getPermissionById(permissionId);
    }

    @PostMapping
    public Permission createPermission(@RequestBody Permission permission) {
        return permissionService.createPermission(permission);
    }

    @PutMapping("/{permissionId}")
    public Permission updatePermission(@PathVariable String permissionId, @RequestBody Permission updatedPermission) {
        return permissionService.updatePermission(permissionId, updatedPermission);
    }

    @DeleteMapping("/{permissionId}")
    public void deletePermission(@PathVariable String permissionId) {
        permissionService.deletePermission(permissionId);
    }
}

