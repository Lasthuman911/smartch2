package org.smart.ch2.controller;

import org.smart.ch2.model.Customer;
import org.smart.ch2.service.CustomerService;

import java.util.List;

/**
 * Created by lszhen on 2017/7/16.
 */
@Controller
public class CustomerController {

    @Inject
    private CustomerService customerService;

    @Action("get:/customer")
    public View index(Param param){
        List<Customer> customerList = customerService.getCustomerList();
        return new View("customer.jsp").addModel("customerList",customerList);
    }
}
