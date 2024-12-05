package com.example.repositry;

import com.example.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

//import javax.management.relation.Role;

public interface RoleRepository extends MongoRepository<Role, String> {}
