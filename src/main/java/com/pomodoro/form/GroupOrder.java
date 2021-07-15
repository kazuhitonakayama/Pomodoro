package com.pomodoro.form;
/**
 * ValidGroup1とValidGroup2でバリデーションチェックを2段階にします。
 * ValidGroup1をチェックしOKならValidGroup2をチェック。
 * ValidGroup1でダメなら即座にエラーメッセージを表示します。
 */

import javax.validation.GroupSequence;

@GroupSequence({ValidGroup1.class, ValidGroup2.class})
public interface GroupOrder {

}
