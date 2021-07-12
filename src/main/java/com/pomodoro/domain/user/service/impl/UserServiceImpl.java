package com.pomodoro.domain.user.service.impl;

import com.pomodoro.domain.user.model.MUser;
import com.pomodoro.domain.user.service.UserService;
import com.pomodoro.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    /**
     * ユーザー登録
     */
    @Override
    public void registUser(MUser user) {
        System.out.println(user);
        mapper.insertOne(user);
    }
}
