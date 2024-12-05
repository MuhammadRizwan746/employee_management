package com.example.repositry;

import com.example.entity.Permission;
import org.springframework.data.mongodb.repository.MongoRepository;

//import java.security.Permission;

public interface PermissionRepository extends MongoRepository<Permission, String> {}
