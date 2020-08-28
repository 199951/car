package com.fan.service.impl;

import com.fan.dao.SysOrderDao;
import com.fan.pojo.Order;
import com.fan.pojo.SysOrder;
import com.fan.service.SysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOrderServiceImpl implements SysOrderService {
    @Autowired
    private SysOrderDao sysOrderDao;
    @Override
    public List<SysOrder> findOrder(Integer uid) {
        return sysOrderDao.findOrder(uid);
    }

    @Override
    public void deleteOrder(Integer id) {
        sysOrderDao.deleteOrder(id);
    }

    @Override
    public void addOrder(Integer uid, Integer cid, Integer getid, Integer backid, Long oprice) {
        String status = "已预定";
        Order order = new Order();
        order.setUid(uid);
        order.setCid(cid);
        order.setGetid(getid);
        order.setBackid(backid);
        order.setOprice(oprice);
        order.setStatus(status);
        sysOrderDao.addOrder(order);
    }
}
