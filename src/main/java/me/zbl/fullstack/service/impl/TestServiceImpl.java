package me.zbl.fullstack.service.impl;


import me.zbl.fullstack.mapper.UserMapper;
import me.zbl.fullstack.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{

    private UserMapper mapper;

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void test() {

    }
}
