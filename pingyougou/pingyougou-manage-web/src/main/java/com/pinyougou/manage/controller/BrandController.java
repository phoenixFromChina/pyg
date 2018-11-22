package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
*   品牌地址
*/
//@Controller
@RestController //组合注解，组合了@ResponseBody注解 和 @Controller，对所有方法生效
@RequestMapping("/brand")
public class BrandController {

    //引入远程的服务对象
    @Reference
    private BrandService brandService;

    /**
     *  
     * 查询所有品牌数据
     * @author phoenlix
     * @date 2018/11/22 11:39
     * @param  * @param 
     * @return java.util.List<com.pinyougou.pojo.TbBrand>   品牌列表json格式字符串
    */
    /*@RequestMapping("/findAll")
    @ResponseBody*/
    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.queryAll();
    }

}
