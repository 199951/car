package com.fan.controller;

import com.fan.common.JsonResult;
import com.fan.pojo.SysCity;
import com.fan.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fan")
public class ShortrentController {
    @Autowired
    private SysCityService sysCityService;
    @RequestMapping("/findCity")
    public JsonResult findCity(Integer pid){
        List<SysCity> list = sysCityService.findCity(pid);
        return new JsonResult(1,list);
    }
}
