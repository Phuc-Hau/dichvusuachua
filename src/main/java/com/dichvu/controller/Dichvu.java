package com.dichvu.controller;

import com.dichvu.dao.DichVuDao;
import com.dichvu.dao.UserDao;
import com.dichvu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Dichvu {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DichVuDao dichVuDao;

    @RequestMapping("/dichvu")
    public String index(Model  model){
       User userModel = userDao.findById(1).get();
       model.addAttribute("fullname",userModel.getFullname());
       model.addAttribute("diachi",userModel.getDiachi());
       model.addAttribute("sdt",userModel.getSdt());
        System.out.println(dichVuDao.findAll());

       model.addAttribute("dichvu",dichVuDao.findAll());

       return "dichvu";
    }
}
