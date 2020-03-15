package com.example.masksystem.service;

import com.example.masksystem.mapper.LotteryMapper;
import com.example.masksystem.pojo.Lottery;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LotteryImplService implements LotteryService {
    @Autowired
    LotteryMapper lotteryMapper;

    @Override
    public void initLottery(Integer id, String start_time, String end_time, Integer mask_number) {
        Lottery lottery = new Lottery(id,start_time,end_time,mask_number);
        lotteryMapper.initLottery(lottery);
    }

    @Override
    public List<Lottery> getAllLottery() {
        return lotteryMapper.getAllLottery();
    }

    @Override
    public Integer getNewLottery() {
        return lotteryMapper.getMaxId();
    }
}
