package com.fan.controller;

import com.fan.common.JsonResult;
import com.fan.pojo.SysOrder;
import com.fan.pojo.SysUser;
import com.fan.service.SysOrderService;
import com.fan.uitls.StrUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fan")
public class MymainController {
    @Autowired
    private SysOrderService sysOrderService;
    @RequestMapping("/mymain")
    public JsonResult mymain(HttpSession session){
        SysUser sysUser = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        return new JsonResult(1,sysUser);
    }
    @RequestMapping("/mymain1")
    public Map mymain1(HttpSession session,Integer page, Integer limit){
        SysUser sysUser = (SysUser)session.getAttribute(StrUtils.LOGIN_USER);
        Integer id = sysUser.getId();
        List<SysOrder> list = sysOrderService.findOrder(id);
        PageHelper.startPage(page,limit);
        PageInfo<SysOrder> pageInfo = new PageInfo<>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }
    @RequestMapping("/deleteOrder")
    public void deleteOrder(Integer id){
        sysOrderService.deleteOrder(id);
    }
}
