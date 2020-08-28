package com.fan.service;

import com.fan.pojo.City;
import com.fan.pojo.Order;
import com.fan.pojo.SysCar;
import com.fan.pojo.SysCity;

import java.util.List;

public interface SysCarService {
    List<SysCar> findByPrice(Integer cid);
    List<SysCar> findNumber(Integer cid);
    City findCitys1(Integer getid, Integer backid);
    SysCar findCar(Integer id);

}
