package com.example.masksystem.service;

import com.example.masksystem.pojo.User;

import java.util.List;

public interface UserService {
    boolean setUser(String id, String phone, String name, Integer mask_number, Integer lottery_id, String count);
    List<User> getUserById(String id);
    List<User> getUserByLotteryId(Integer lottery_id);
    User getUserByIdAndLottery(String id, Integer lottery_id);
}
