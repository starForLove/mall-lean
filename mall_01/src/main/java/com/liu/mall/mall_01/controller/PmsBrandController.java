package com.liu.mall.mall_01.controller;

import com.liu.mall.mall_01.mbg.model.PmsBrand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌分配控制类
 * @Author Xiao Liu
 * @Date 2019/7/24 10:36
 * @Version 1.0
 */
@RestController
@Api(value="产品品牌",description = "产品品牌分类管理",tags = "PmsBrandController")
@RequestMapping(value="/pmsBrand")
public class PmsBrandController {

    @ApiOperation("获取所有的产品品牌")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public Object listAllPmsBrand(){
        return 0;
    }

}
