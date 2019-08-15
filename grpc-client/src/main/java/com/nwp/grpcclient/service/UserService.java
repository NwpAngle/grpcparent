package com.nwp.grpcclient.service;

import com.nwp.model.Greeting;
import com.nwp.model.User;
import com.nwp.service.UserServiceGrpcGrpc;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserService {
    @GrpcClient("user-grpc")
    private Channel serverChannel;

    public void sayHello(){
        UserServiceGrpcGrpc.UserServiceGrpcBlockingStub userServiceGrpcBlockingStub = UserServiceGrpcGrpc.newBlockingStub(serverChannel);
        Greeting greeting = userServiceGrpcBlockingStub.sayHello(User.newBuilder().setFirstName("hali").setLastName("bote").build());
        log.info("server reponse {}",greeting.getMessage());
    }

}
