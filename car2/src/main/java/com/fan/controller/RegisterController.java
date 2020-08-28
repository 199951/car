
package com.fan.controller;

import com.fan.common.JsonResult;
import com.fan.pojo.SysUser;
import com.fan.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/fan")
public class RegisterController {
    @Autowired
        private SysUserService sysUserService;
        @RequestMapping("/insertTel")
        public JsonResult insertTel(SysUser sysUser){
            System.out.println(sysUser);
            sysUserService.insertTel(sysUser);
            return new JsonResult(1,null);
    }
}

