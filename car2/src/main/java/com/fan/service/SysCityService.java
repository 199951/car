package com.fan.service;

import com.fan.pojo.City;
import com.fan.pojo.SysCity;

import java.util.List;

public interface SysCityService {
    List<SysCity> findCity(Integer pid);
    City findCitys(Integer getid, Integer backid);
}
