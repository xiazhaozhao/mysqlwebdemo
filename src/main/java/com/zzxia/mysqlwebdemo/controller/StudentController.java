package com.zzxia.mysqlwebdemo.controller;

import com.zzxia.mysqlwebdemo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @RequestMapping("/")
    String index() {
        return "Index";
    }
    @RequestMapping("/save")
    @ResponseBody
    Boolean save(@RequestParam("name") String name, @RequestParam("age") int age ){
        System.out.println(name+":"+age);
        studentService.Save(name,age);
        return true;
    }
}
