package com.fan.dao;

import com.fan.pojo.SysCity;

import java.util.List;

public interface SysCityDao {
    List<SysCity> findCity(Integer pid);
    SysCity findCitys(Integer id);
}
