package com.example.masksystem.mapper;

import com.example.masksystem.pojo.Lottery;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LotteryMapper {
    @Insert("INSERT INTO lottery(start_time, end_time, mask_number) VALUES(#{start_time}, #{end_time}, #{mask_number})")
    void initLottery(Lottery lottery);

    @Select("SELECT * FROM lottery")
    List<Lottery> getAllLottery();

    @Select("SELECT max(lottery_id) FROM lottery")
    Integer getMaxId();
}
