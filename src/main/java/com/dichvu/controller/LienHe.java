package com.dichvu.controller;

import com.dichvu.dao.UserDao;
import com.dichvu.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LienHe {

    @Autowired
    UserDao userDao;

    @RequestMapping("/lienhe")
    public String lienhe(Model model, @ModelAttribute("lienhe") LienHe  lienHe){
        User userModel = userDao.findById(1).get();
        model.addAttribute("fullname",userModel.getFullname());
        model.addAttribute("diachi",userModel.getDiachi());
        model.addAttribute("sdt",userModel.getSdt());
        return "lienhe";
    }
}
