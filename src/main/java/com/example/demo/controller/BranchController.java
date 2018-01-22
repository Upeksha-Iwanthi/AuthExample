package com.example.demo.controller;

import com.example.demo.persistance.ClassModificationHistory;
import com.example.demo.service.BranchService;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BranchController
{
    @Autowired
    private BranchService branchService;

    @CrossOrigin(origins = "*")
    @RequestMapping( path = "api/getAllBranches", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<ClassModificationHistory> findBranches()
    {
            return branchService.showBranchData();
    }

}

