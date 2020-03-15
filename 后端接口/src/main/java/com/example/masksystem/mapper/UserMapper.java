package com.example.masksystem.mapper;

import com.example.masksystem.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Insert("INSERT INTO user(id,phone,name,mask_number,lottery_id) VALUES(#{id}, #{phone}, #{name}, #{mask_number}" +
            ", #{lottery_id})")
    void insertUserData(String id, String phone, String name, Integer mask_number, Integer lottery_id);

    @Select("SELECT * FROM user WHERE id=#{id}")
    List<User> selectById(String id);

    @Select("SELECT * FROM user WHERE lottery_id=#{lottery_id}")
    List<User> selectByLotteryId(Integer lottery_id);
}
