package org.smart.ch2.controller;

import org.smart.ch2.model.Customer;
import org.smart.ch2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by lszhen on 2017/7/15.
 */
@WebServlet("/customer1")
public class CustomerServlet extends HttpServlet{

    private CustomerService customerService;

    /**
     * 后续用单例模式进行优化
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("customerList",customerList);
        req.setAttribute("wzm","hahahaList");
        req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(
                req,resp
        );
    }
}
