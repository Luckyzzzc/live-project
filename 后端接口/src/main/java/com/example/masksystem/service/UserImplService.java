package com.example.masksystem.service;

import com.example.masksystem.mapper.UserMapper;
import com.example.masksystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserImplService implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean setUser(String id, String phone, String name, Integer mask_number, Integer lottery_id) {
        userMapper.insertUserData(id,phone,name,mask_number,lottery_id);
        return true;
    }

    @Override
    public List<User> getUserById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUserByLotteryId(Integer lottery_id) {
        return userMapper.selectByLotteryId(lottery_id);
    }
}
