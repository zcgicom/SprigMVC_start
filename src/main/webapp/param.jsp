<%--
  Created by IntelliJ IDEA.
  User: 麦本本
  Date: 2020/6/20
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
    <%--
    <a href="param/testParam?username=John&password=123">请求参数绑定</a><!--href相对路径-->
    --%>

    <!--把数据封装到Account类中
    <form action="param/saveAccount" method="post"><%--使用post请求提交中文时会出现中文乱码，get请求不会出现中文乱码
                                                       解决方法：优先配置中文乱码过滤器(web.xml)，也可使用“request.setChart”--%>
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="text" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        用户姓名：<input type="text" name="user.uname"/><br/>
        用户年龄：<input type="text" name="user.age"/><br/>
        <input type="submit" value="提交"/>
    </form>
    -->
    <%--把数据封装到Account类中，类中含有list和map的集合--%>
<%--    <form action="param/saveAccount" method="post">&lt;%&ndash;使用post请求提交中文时会出现中文乱码，get请求不会出现中文乱码
                                                       解决方法：优先配置中文乱码过滤器(web.xml)，也可使用“request.setChart”&ndash;%&gt;
        姓名：<input type="text" name="username"/><br/>
        密码：<input type="text" name="password"/><br/>
        金额：<input type="text" name="money"/><br/>
        &lt;%&ndash;把以下连个text封装到User对象中，再把User对象存入list集合中&ndash;%&gt;
        用户姓名：<input type="text" name="list[0].uname"/><br/>
        用户年龄：<input type="text" name="list[0].age"/><br/>
        &lt;%&ndash;把以下连个text封装到User对象中，再把User对象存入map集合中&ndash;%&gt;
        用户姓名：<input type="text" name="map['one'].uname"/><br/>
        用户年龄：<input type="text" name="map['one'].age"/><br/>
        <input type="submit" value="提交"/>
    </form>--%>
    <%--自定义类型转换器--%>
    <form action="param/saveuser" method="post"><%--使用post请求提交中文时会出现中文乱码，get请求不会出现中文乱码
                                                       解决方法：优先配置中文乱码过滤器(web.xml)，也可使用“request.setChart”--%>
        用户姓名：<input type="text" name="uname"/><br/>
        用户年龄：<input type="text" name="age"/><br/>
        用户生日：<input type="text" name="date"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
