package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {
    private Integer id;
    private String tel;
    private String password;
    private String email;
    private String invitation;
}
