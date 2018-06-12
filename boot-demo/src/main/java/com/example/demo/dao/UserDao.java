package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User,Integer> {

         @Query("select t from  User t where  t.name= ?1")
         User findByName(@Param("name") String name);



}
