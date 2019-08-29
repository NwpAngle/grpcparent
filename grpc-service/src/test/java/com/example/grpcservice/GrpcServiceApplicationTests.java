package com.example.grpcservice;

import com.example.grpcservice.service.UserService;
import com.example.grpcservice.user_info.tables.pojos.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GrpcServiceApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = userService.getUserById(1);
        System.out.println(user);
    }

}
