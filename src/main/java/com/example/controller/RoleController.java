package com.example.controller;

import com.example.entity.Role;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.management.relation.Role;
import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @GetMapping("/{roleId}")
    public Role getRoleById(@PathVariable String roleId) {
        return roleService.getRoleById(roleId);
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    @PutMapping("/{roleId}")
    public Role updateRole(@PathVariable String roleId, @RequestBody Role updatedRole) {
        return roleService.updateRole(roleId, updatedRole);
    }

    @DeleteMapping("/{roleId}")
    public void deleteRole(@PathVariable String roleId) {
        roleService.deleteRole(roleId);
    }
}
