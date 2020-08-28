package com.fan.service.impl;

import com.fan.dao.SysCityDao;
import com.fan.pojo.City;
import com.fan.pojo.SysCity;
import com.fan.service.SysCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysCityServiceImpl implements SysCityService {
    @Autowired
    private SysCityDao sysCityDao;
    @Override
    public List<SysCity> findCity(Integer pid) {
        return sysCityDao.findCity(pid);
    }

    @Override
    public City findCitys(Integer getid, Integer backid) {
        SysCity getCity = sysCityDao.findCitys(getid);
        SysCity backCity = sysCityDao.findCitys(backid);
        City city = new City();
        city.setGetCity(getCity);
        city.setBackCity(backCity);
        return city;
    }


}
