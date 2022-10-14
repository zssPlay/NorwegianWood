package com.wood.po;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserProfile {

    private Integer device_id;

    private String gender;

    private String province;

    private String university;

    private BigDecimal gpa;

    private Integer id;

    private Integer age;
}
