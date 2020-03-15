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
import java.util.Random;

@Controller
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    String addUser(String id, String phone, String name, Integer mask_number, Integer lottery_id){
        if(userService.getUserByIdAndLottery(id, lottery_id) != null
        || userService.getUserByIdAndLottery(id,lottery_id - 1) != null
        || userService.getUserByIdAndLottery(id, lottery_id - 2) != null){
            return "0";
        } else{
            String count = getRandomString(8);
            userService.setUser(id,phone,name,mask_number,lottery_id,count);
            return count;
        }
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

    private String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
}
