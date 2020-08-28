package com.fan.service.impl;

import com.fan.dao.SysCarDao;
import com.fan.pojo.City;
import com.fan.pojo.SysCar;
import com.fan.pojo.SysCity;
import com.fan.service.SysCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysCarServiceImpl implements SysCarService {
    @Autowired
    private SysCarDao sysCarDao;
    @Override
    public List<SysCar> findByPrice(Integer cid) {
        return sysCarDao.findByPrice(cid);
    }

    @Override
    public List<SysCar> findNumber(Integer cid) {
        return sysCarDao.findNumber(cid);
    }

    @Override
    public City findCitys1(Integer getid, Integer backid) {
        SysCity getCity = sysCarDao.findCitys1(getid);
        SysCity backCity = sysCarDao.findCitys1(backid);
        City city = new City();
        city.setGetCity(getCity);
        city.setBackCity(backCity);
        return city;
    }

    @Override
    public SysCar findCar(Integer id) {
        return sysCarDao.findCar(id);
    }
}
