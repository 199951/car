package com.fan.controller;


import com.fan.common.JsonResult;
import com.fan.pojo.SysUser;
import com.fan.service.SysUserService;
import com.fan.uitls.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/fan")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/findTel")
    public JsonResult findTel(HttpServletRequest request, HttpSession session){
        String tel = request.getParameter("tel");
        String password = request.getParameter("password");
        SysUser sysUser = sysUserService.findTel(tel, password);
        session.setAttribute(StrUtils.LOGIN_USER,sysUser);
        return new JsonResult(1,sysUser);
    }
}
