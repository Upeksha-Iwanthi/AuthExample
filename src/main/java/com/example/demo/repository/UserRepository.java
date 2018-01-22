package com.example.demo.repository;

import com.example.demo.persistance.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserData,Long> {
    List<UserData> findByUsername(final String userName);
    List<UserData> findByPassword(final String password);
}
