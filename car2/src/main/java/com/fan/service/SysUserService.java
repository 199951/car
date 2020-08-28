package com.fan.service;

import com.fan.pojo.SysUser;

import java.util.List;

public interface SysUserService {
    SysUser findTel(String tel, String password);
    void insertTel(SysUser sysUser);
    List<SysUser> findId(Integer id);
    void updatePassword(SysUser sysUser);
}
