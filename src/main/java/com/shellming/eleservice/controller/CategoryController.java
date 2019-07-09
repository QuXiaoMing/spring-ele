package com.shellming.eleservice.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shellming.eleservice.common.ResultBean;
import com.shellming.eleservice.entity.Category;
import com.shellming.eleservice.service.impl.CategoryServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Api(value = "分类接口", description = "分类接口")
@Slf4j
@RequestMapping(value = "category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ApiOperation(value = "分类列表")
    public ResultBean list(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize, @RequestParam(required = false) String name) {
        Map map = new HashMap();
        if (StringUtils.isNotBlank(name)) {
            map.put("name", name);
        }
        log.info("查询分类列表", map);
        PageHelper.startPage(pageNum, pageSize);
        List list = categoryService.list(map);
        PageInfo ret = new PageInfo(list);
        return ResultBean.success(ret);
    }
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ApiOperation(value = "添加分类")
    public  ResultBean create(@RequestBody Category category) {
        log.info("添加分类");
        int ret = categoryService.insert(category);
        log.info("创建结果{}", ret);
        if (ret > 0) {
            return  ResultBean.success(ret);
        }
        return ResultBean.fail("创建失败");
    }
}
