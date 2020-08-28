package com.fan.dao;

import com.fan.pojo.SysCar;
import com.fan.pojo.SysCity;

import java.util.List;

public interface SysCarDao {
    List<SysCar> findByPrice(Integer cid);
    List<SysCar> findNumber(Integer cid);
    SysCity findCitys1(Integer id);
    SysCar findCar(Integer id);
}
