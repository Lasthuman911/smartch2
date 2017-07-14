package org.smart.ch2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhiming.wu on 2017/7/13.
 */

/**
 * 创建客户
 */
/*访问该servlet的 url 映射（地址）（此处为相对路径，即 "项目名称/customer_create"
 该注解的作用等价于 在web.xml中配置的该servlet的<servlet-mapping>元素中<url-pattern>的配置*/
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //TODO
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        //TODO
    }
}
