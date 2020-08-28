package com.fan.dao;

import com.fan.pojo.Order;
import com.fan.pojo.SysOrder;

import java.util.List;

public interface SysOrderDao {
    List<SysOrder> findOrder(Integer uid);
    void deleteOrder(Integer id);
    void addOrder(Order order);
}
