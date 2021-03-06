package com.shellming.eleservice.controller;

import com.shellming.eleservice.common.ResultBean;
import com.shellming.eleservice.entity.City;
import com.shellming.eleservice.service.JwtIgnore;
import com.shellming.eleservice.service.impl.CityServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("city")
@Api(description = "城市接口")
@Slf4j
public class CityController {

    @Autowired
    private CityServiceImpl cityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation("获取城市列表")
    @JwtIgnore
    public ResultBean list() {
        Map map = new HashMap();
        List list = cityService.list(map);
        if (list != null) {
            return ResultBean.success(list);
        }
        return ResultBean.fail("获取失败");
    }

    @RequestMapping(value = "loadCityData", method = RequestMethod.GET)
    @ApiOperation("加载城市数据")
    @JwtIgnore
    public ResultBean loadCityData() {
        int count = cityService.loadCityData();
        return ResultBean.success(count);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ApiOperation("获取城市信息")
    @JwtIgnore
    public ResultBean getCity(@PathVariable("id") Integer id) {
        log.info("获取城市信息:" + id);
        City city = cityService.selectByPrimaryKey(id);
        log.info("获取城市信息: {}" + city);
        return ResultBean.success(city);
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation("创建City")
    @JwtIgnore
    public ResultBean create(@RequestBody City city) {
        log.info(city.toString());
        int ret = cityService.insert(city);
        if (ret > 0) {
            return ResultBean.success(ret);
        }
        return ResultBean.fail("创建失败");
    }
}
