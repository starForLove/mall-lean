package com.liu.mall.mall_01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by liu on 2019/4/8.
 */
@Configuration
@MapperScan("com.liu.mall.mall_01.mbg.mapper")
public class MyBatisConfig {
}

