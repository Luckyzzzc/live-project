package com.example.masksystem.pojo;

public class Lottery {
    private Integer id;
    private String start_time;
    private String end_time;
    private Integer mask_number;

    public Lottery(Integer id, String start_time, String end_time, Integer mask_number){
        this.setId(id);
        this.setStart_time(start_time);
        this.setEnd_time(end_time);
        this.setMask_number(mask_number);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setMask_number(Integer mask_number) {
        this.mask_number = mask_number;
    }

    public Integer getMask_number() {
        return mask_number;
    }
}
