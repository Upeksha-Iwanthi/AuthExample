package com.example.demo.service;

import com.example.demo.persistance.ClassModificationHistory;

public interface BranchService {
    Iterable<ClassModificationHistory> showBranchData();
}
