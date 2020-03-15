package com.example.masksystem.controller;

import com.example.masksystem.pojo.User;
import com.example.masksystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    boolean addUser(String id, String phone, String name, Integer mask_number, Integer lottery_id){
        if(userService.setUser(id,phone,name,mask_number,lottery_id))
            return true;
        return false;
    }

    List<User> getUserById(String id){
        return userService.getUserById(id);
    }

    List<User> getUserByLottery(Integer lottery_id){
        return userService.getUserByLotteryId(lottery_id);
    }

    @RequestMapping("/sum")
    @ResponseBody
    Integer getMaskSum(@RequestParam Integer lottery_id){
        List<User> userList = userService.getUserByLotteryId(lottery_id);
        Integer sum = 0;
        for(User user : userList){
            sum += user.getMask_number();
        }
        return sum;
    }
}
