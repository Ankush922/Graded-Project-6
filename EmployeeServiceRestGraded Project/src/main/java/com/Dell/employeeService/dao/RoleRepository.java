package com.Dell.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dell.employeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
