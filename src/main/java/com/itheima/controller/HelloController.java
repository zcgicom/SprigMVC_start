package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Chen
 * @create 2020-06-19 18:14
 * 控制器的类
 *
 * 程序流程：
 * 1.index.jsp文件中，发生a标签的点击；
 * 2.a标签的超链接执行“HelloController”类中的“sayHello()”方法
 * 3.执行上述“sayHello()”方法，需要将当前类变成一个对象【把类交给IOC容器管理】
 */
@Controller
@RequestMapping("/user")
public class HelloController {

    @RequestMapping(path = "/hello")//用于建立URL和处理请求方法之间的对应关系。
                                    //该注解可用于方法上(相当于请求的二级路径)，也可用于类上(相当于一级路径)；如:“/user/hello”
                                    //user --> HelloController;  hello --> sayHello()
    public String sayHello(){
        System.out.println("Hello SpringMVC!");
        return "success";
    }

    /**
     * RequestMapping注解
     * @return
     * @AliasFor注解为别名的意思，在“@RequestMapping”注解中，使用了“@AliasFor”注解，使得“path”属性和“value”属性用途一样
     * RequestMapping注解属性：
     * 1.path、value：使用“@RequestMapping”注解时，可以写“path”属性、“Value”属性或者不写属性名，均可指定请求的URL。
     * 2.method：指定请求方式，不写时默认为GET。如“method = {RequestMethod.POST}”。
     * 3.params：用于指定限制请求参数的条件。支持简单的表达式，要求请求参数的key和value必须和配置一模一样。
     * 4.headers：用于指定限制请求消息头的条件。发送的请求中必须包含请求头。
     * 注意：以上四个属性只要出现2个或以上时，他们的关系就是与的关系。
     */
    @RequestMapping(value = "/testRequestMapping",params = {"username=John","password=123"},headers = {"Accept"})
    public String testRequestMapping(){
        System.out.println("测试RequestMapping...");
        return "success";
    }
}
