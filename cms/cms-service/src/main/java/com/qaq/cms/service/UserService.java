package com.qaq.cms.service;

import com.qaq.cms.mapper.UserMapper;
import com.qaq.cms.model.User;
import com.qaq.cms.model.UserVO;

import java.util.List;
import java.util.Map;

/**
 * @author : Administrator
 */
public interface UserService extends BaseService<UserMapper> {

    /**
     * 获取带book数据的用户
     * @param id
     * @return
     */
    UserVO selectUserWithBook(int id);

    /**
     * 根据条件获取用户列表
     * @param map
     * @return
     */
    List<User> selectAll(Map<String, Object> map);

    /**
     * 插入用户并返回主键
     * @param user
     */
    void insertAutoKey(User user);

}
