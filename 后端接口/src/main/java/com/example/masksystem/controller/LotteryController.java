package com.example.masksystem.controller;

import com.example.masksystem.pojo.Lottery;
import com.example.masksystem.service.LotteryService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LotteryController {
    @Autowired
    LotteryService lotteryService;

    @RequestMapping("/addLottery")
    @ResponseBody
    Lottery addLottery(@RequestParam String start_time, @RequestParam String end_time, @RequestParam Integer mask_number){
        lotteryService.initLottery(null,start_time,end_time,mask_number);
        return new Lottery(lotteryService.getNewLottery(),start_time,end_time,mask_number);
    }

    @RequestMapping("/select/lottery")
    @ResponseBody
    List<Lottery> getAllLottery(){
        return lotteryService.getAllLottery();
    }
}
