package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chen
 * @create 2020-06-20 10:15
 * 请求参数绑定
 */
@Controller
@RequestMapping("/param")
public class ParamController {

    //参数绑定
    @RequestMapping("/testParam")
    public String testParam(String username,String password){//此处传参需和.jsp文件提交的key值一致
        System.out.println("执行参数绑定");
        System.out.println("用户名："+username+",密码："+password);
        return "success";
    }
    //请求参数绑定 -- 把请求参数封装到JavaBean的类中
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){//提交的form表单数据会默认封装到account对象中
        System.out.println("通过JavaBean执行参数绑定");
        System.out.println(account);
        return "success";
    }

    //自定义类型转换器
    @RequestMapping("/saveuser")
    public String saveuser(User user){
        System.out.println("自定义类型转换。。。");
        System.out.println(user);
        return "success";
    }
}
