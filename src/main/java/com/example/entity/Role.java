package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import lombok.Data;
import java.util.List;

//@Data
@Document(collection = "roles")
public class Role {

    @Id
    private String roleId;
    private String roleName;
    private List<String> permissionIds;  // List of Permission IDs
    private String createdAt;
    private String updatedAt;

    // Parameterized constructor
    public Role(String roleId, String roleName, List<String> permissionIds, String createdAt, String updatedAt) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.permissionIds = permissionIds;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getter and setter methods (generated by Lombok @Data)
    // You can still manually write the getter and setter methods if needed like below:

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<String> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<String> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}