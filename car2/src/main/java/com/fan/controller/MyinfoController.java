package com.fan.controller;

import com.fan.common.JsonResult;
import com.fan.pojo.SysUser;
import com.fan.service.SysUserService;
import com.fan.uitls.StrUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.sound.sampled.Line;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fan")
public class MyinfoController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/myinfo")
    public JsonResult myinfo(HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        return new JsonResult(1,sysUser);
    }
    @RequestMapping("/myinfo1")
    public Map<String, Object> myinfo1(HttpSession session, Integer page, Integer limit){
        SysUser sysUser = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        Integer id = sysUser.getId();
        List<SysUser> list = sysUserService.findId(id);
        PageHelper.startPage(page,limit);
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("/myinfo2")
    public JsonResult myinfo2(HttpSession session,SysUser sysUser){
        SysUser sysUser1 = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        sysUser1.setPassword(sysUser.getPassword());
        sysUserService.updatePassword(sysUser1);
        return new JsonResult(1,sysUser);
    }
}
