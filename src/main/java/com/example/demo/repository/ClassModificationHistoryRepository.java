package com.example.demo.repository;

import com.example.demo.persistance.ClassModificationHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassModificationHistoryRepository extends CrudRepository<ClassModificationHistory,Long>{

}
