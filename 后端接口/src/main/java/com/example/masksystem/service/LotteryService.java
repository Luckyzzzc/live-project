package com.example.masksystem.service;

import com.example.masksystem.pojo.Lottery;

import java.util.List;

public interface LotteryService {
    void initLottery(Integer id, String start_time, String end_time, Integer mask_number);
    List<Lottery> getAllLottery();
    Integer getNewLottery();
}
