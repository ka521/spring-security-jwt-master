package com.codingclub.sercurity.sercuritydemo.repository;

import com.codingclub.sercurity.sercuritydemo.entity.Role;
import com.codingclub.sercurity.sercuritydemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);

}
