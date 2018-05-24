package com.zzxia.mysqlwebdemo.service;

import com.zzxia.mysqlwebdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class StudentService implements IStudentService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean Save(String name, int age) {

        Boolean flag;
        try {
            flag = userMapper.Save(name,age);
        }catch (Exception e){
            return false;
        }
        return flag;
    }
}
