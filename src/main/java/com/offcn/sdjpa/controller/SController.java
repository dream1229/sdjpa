package com.offcn.sdjpa.controller;

import com.offcn.sdjpa.dao.SDao;
import com.offcn.sdjpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SController {
    @Autowired
    private SDao sDao;


    @RequestMapping("/lists")
    public String getList(Model model){
        List<Student> list = sDao.findAll();
        model.addAttribute("list",list);
        return "student";
    }

}
