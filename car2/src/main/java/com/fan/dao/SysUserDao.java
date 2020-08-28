package com.fan.dao;

import com.fan.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysUserDao {
    SysUser findTel(String tel);
    void insertTel(SysUser sysUser);
    List<SysUser> findId(Integer id);
    void updatePassword(SysUser sysUser);
}
