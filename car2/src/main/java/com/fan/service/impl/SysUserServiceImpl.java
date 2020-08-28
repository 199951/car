package com.fan.service.impl;

import com.fan.dao.SysUserDao;
import com.fan.pojo.SysUser;
import com.fan.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;
    @Override
    public SysUser findTel(String tel, String password) {
        SysUser sysUser = sysUserDao.findTel(tel);
        if(sysUser.getTel() == null){
            throw new RuntimeException("没有这个账号");
        }
        if(!sysUser.getPassword().equals(password)){
            throw new RuntimeException("密码不对");
        }
        return sysUser;
    }

    @Override
    public void insertTel(SysUser sysUser) {
        sysUserDao.insertTel(sysUser);
    }

    @Override
    public List<SysUser> findId(Integer id) {
        return sysUserDao.findId(id);
    }

    @Override
    public void updatePassword(SysUser sysUser) {
        sysUserDao.updatePassword(sysUser);
    }


}
