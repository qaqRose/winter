package com.qaq.cms.service.impl;

import com.qaq.cms.mapper.UserMapper;
import com.qaq.cms.model.User;
import com.qaq.cms.service.UserService;
import com.qaq.cms.mapper.UserVOMapper;
import com.qaq.cms.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
/**
 * @author : Administrator
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserVOMapper userVOMapper;

    /**
     * 获取基本操作mapper
     * @return
     */
    public UserMapper getMapper() {
        return userMapper;
    }

    /**
     * 获取带book数据的用户
     * @param id
     * @return
     */
    public UserVO selectUserWithBook(int id) {
        return userVOMapper.selectUserWithBook(id);
    }

    /**
     * 根据条件获取用户列表
     * @param map
     * @return
     */
    public List<User> selectAll(Map<String, Object> map) {
        return userVOMapper.selectAll(map);
    }

    /**
     * 插入用户并返回主键
     * @param user
     */
    public void insertAutoKey(User user) {
        userVOMapper.insertAutoKey(user);
    }


}