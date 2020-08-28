package com.fan.controller;

import com.fan.common.JsonResult;
import com.fan.pojo.City;
import com.fan.pojo.SysCar;
import com.fan.pojo.SysCity;
import com.fan.pojo.SysUser;
import com.fan.service.SysCarService;
import com.fan.service.SysCityService;
import com.fan.service.SysOrderService;
import com.fan.uitls.StrUtils;
import org.springframework.beans.NotReadablePropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/fan")
public class ShortsortController {
    @Autowired
    private SysCityService sysCityService;
    @Autowired
    private SysCarService sysCarService;
    @Autowired
    private SysOrderService sysOrderService;
    @RequestMapping("/findCitys")
    public JsonResult findCitys(Integer getid, Integer backid){
        City citys = sysCityService.findCitys(getid, backid);
        return new JsonResult(1,citys);
    }
    @RequestMapping("/findByPrice")
    public JsonResult findByPrice(Integer getid){
        List<SysCar> byPrice = sysCarService.findByPrice(getid);
        return new JsonResult(1,byPrice);
    }
    @RequestMapping("/findNumber")
    public JsonResult findNumber(Integer getid){
        List<SysCar> byPrice = sysCarService.findNumber(getid);
        return new JsonResult(1,byPrice);
    }
    @RequestMapping("/findCitys1")
    public JsonResult findCitys1(Integer getid, Integer backid){
        City citys1 = sysCarService.findCitys1(getid, backid);
        return new JsonResult(1,citys1);
    }
    @RequestMapping("/findCar")
    public JsonResult findCar(Integer cid){
        SysCar car = sysCarService.findCar(cid);
        return new JsonResult(1,car);
    }
    @RequestMapping("/addOrder")
    public JsonResult addOrder(HttpSession session,Integer cid, Integer getid, Integer backid, Long oprice){
        SysUser sysUser = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        sysOrderService.addOrder(sysUser.getId(),cid,getid,backid,oprice);
        return new JsonResult(1,"成功");
    }
}
