package com.fan.controller;


import com.fan.common.JsonResult;
import com.fan.pojo.SysUser;
import com.fan.service.SysUserService;
import com.fan.uitls.StrUtils;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fan")
public class SessionController {
    @Autowired
    private SysUserService sysUserService;
    @RequestMapping("/session")
    public JsonResult session(HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        System.out.println(sysUser);
        JsonResult jsonResult = null;
        if(sysUser != null){
            jsonResult = new JsonResult(1,sysUser);
        }else {
            jsonResult = new JsonResult(0,"用户没有登录");
        }
        return jsonResult;
    }
}


