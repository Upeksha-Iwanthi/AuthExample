package com.example.demo.service.impl;

import com.example.demo.persistance.ClassModificationHistory;
import com.example.demo.repository.ClassModificationHistoryRepository;
import com.example.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService{

    @Autowired
    public ClassModificationHistoryRepository classModificationHistoryRepository;

    @Override
    public Iterable<ClassModificationHistory> showBranchData() {
             return classModificationHistoryRepository.findAll();
    }
}
