package com.fan.service;

import com.fan.pojo.SysOrder;

import java.util.List;

public interface SysOrderService {
    List<SysOrder> findOrder(Integer uid);
    void deleteOrder(Integer id);
    void addOrder(Integer uid, Integer cid, Integer getid, Integer backid, Long oprice);
}
