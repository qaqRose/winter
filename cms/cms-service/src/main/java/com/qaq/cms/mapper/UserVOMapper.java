package com.qaq.cms.mapper;

import com.qaq.cms.model.UserVO;
import com.qaq.cms.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author : Administrator
 */
public interface UserVOMapper extends UserMapper {

    UserVO selectUserWithBook(int id);

    List<User> selectAll(Map<String, Object> map);

    void insertAutoKey(User user);
}