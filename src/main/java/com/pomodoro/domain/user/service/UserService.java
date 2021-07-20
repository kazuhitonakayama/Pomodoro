package com.pomodoro.domain.user.service;

import com.pomodoro.domain.user.model.MUser;

public interface UserService {
    /**
     * ユーザー登録
     */
    public void registUser(MUser user);

    /**
     * ログインユーザー情報取得
     */
    public MUser getLoginUser(String userId);

}
