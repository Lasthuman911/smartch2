package org.smart.ch2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart.ch2.helper.DataBaseHelper;
import org.smart.ch2.model.Customer;
import org.smart.ch2.service.CustomerService;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by zhiming.wu on 2017/7/13.
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest(){
        customerService = new CustomerService();
    }

    @Before
    public void init(){
        //TODO 初始化数据库
       // DataBaseHelper.getConnection();
        DataBaseHelper.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() throws Exception{
        List<Customer> customerList = customerService.getCustomerList();
        assertEquals(2,customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception{
        long id = 1;
        Customer customer = customerService.getCustomer(id);
       assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception{
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("id",3);
        fieldMap.put("name","customer3");
        fieldMap.put("contact","jj");
        boolean result = customerService.createCustomer(fieldMap);
        assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception{
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name","customerX");
        fieldMap.put("contact","jj");
        boolean result = customerService.updateCustomer(id,fieldMap);
        assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception{
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        assertTrue(result);
    }


}
