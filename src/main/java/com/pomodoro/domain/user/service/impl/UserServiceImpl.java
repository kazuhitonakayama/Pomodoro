package com.pomodoro.domain.user.service.impl;

import com.pomodoro.domain.user.model.MUser;
import com.pomodoro.domain.user.service.UserService;
import com.pomodoro.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Autowired
    private PasswordEncoder encoder;

    /**
     * ユーザー登録
     */
    @Override
    public void registUser(MUser user) {
        String rawPassword = user.getPassword();
        user.setPassword(encoder.encode(rawPassword));

        mapper.insertOne(user);
    }

    @Override
    public MUser getLoginUser(String userId) {
        return mapper.findLoginUser(userId);
    }
}
