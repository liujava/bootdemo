package com.example.demo.dao;

import com.example.demo.mapper.mappermodule.UserRole;

import java.util.List;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Mon Jun 25 16:33:27 CST 2018
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbg.generated Mon Jun 25 16:33:27 CST 2018
     */
    int insertSelective(UserRole record);

    List<UserRole> getAllUsers();
}