package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface BrandMapper {

    /*
    *   查询全部品牌数据
    */
    List<TbBrand> queryAll();
}
