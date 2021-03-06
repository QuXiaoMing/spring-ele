package com.shellming.eleservice.service;

import com.shellming.eleservice.entity.Shop;

import java.util.List;
import java.util.Map;

public interface IShopService {
    int create(Shop shop);

    List list(Map map);

    List search(Map map);

    int deleteByPrimaryKey(String id);

    Shop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}
