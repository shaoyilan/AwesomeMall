package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by lkmc2 on 2018/2/2.
 * 用户服务接口
 */
public interface IUserService {
    /**
     * 登陆方法
     * @param username 用户名
     * @param password 用户密码
     * @return 服务响应
     */
    ServerResponse<User> login(String username, String password);

    /**
     * 注册方法
     * @param user 用户
     * @return 服务响应
     */
    ServerResponse<String> register(User user);

    /**
     * 检查参数是否合法
     * @param str 参数
     * @param type 参数类型
     * @return 参数是否合法
     */
    ServerResponse<String> checkValid(String str, String type);

    /**
     * 根据用户名选择找回密码的问题
     * @param username 用户名
     * @return 找回密码的问题
     */
    ServerResponse<String> selectQuestion(String username);

    /**
     * 检查找回密码问题的答案是否正确
     * @param username 用户名
     * @param question 找回密码问题
     * @param answer 用户的回答
     * @return 答案是否正确
     */
    ServerResponse<String> checkAnswer(String username, String question, String answer);

    /**
     * 忘记密码后通过用户名重置密码
     * @param username 用户名
     * @param passwordNew 新密码
     * @param forgetToken 用户Token
     * @return 是否重置成功
     */
    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    /**
     * 登陆状态下重置密码
     * @param passwordOld 旧密码
     * @param passwordNew 新密码
     * @param user 用户
     * @return 是否重置成功
     */
    ServerResponse<String> resetPassword(String passwordOld, String passwordNew, User user);

    /**
     * 更新用户信息
     * @param user 用户
     * @return 是否更新成功
     */
    ServerResponse<User> updateInformation(User user);

    /**
     * 获取用户信息
     * @param userId 用户id
     * @return 对应的用户信息
     */
    ServerResponse<User> getInformation(Integer userId);

    /**
     * 检查用户是否是管理员（backend后台）
     * @param user 用户
     * @return 用户是否是管理员
     */
    ServerResponse checkAdminRole(User user);
}
