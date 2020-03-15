package com.example.masksystem.pojo;

public class User {
    private String id;
    private String phone;
    private String name;
    private Integer mask_number;
    private Integer lottery_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMask_number() {
        return mask_number;
    }

    public void setMask_number(Integer mask_number) {
        this.mask_number = mask_number;
    }

    public Integer getLottery_id() {
        return lottery_id;
    }

    public void setLottery_id(Integer lottery_id) {
        this.lottery_id = lottery_id;
    }
}
