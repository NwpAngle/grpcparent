package com.example.grpcservice.service.impl;


import com.nwp.model.Greeting;
import com.nwp.model.User;
import com.nwp.service.UserServiceGrpcGrpc;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@Slf4j
@GrpcService(UserServiceGrpcGrpc.class)
public class UserServiceGrpcImpl extends UserServiceGrpcGrpc.UserServiceGrpcImplBase {

    @Override
    public void sayHello(User request, StreamObserver<Greeting> responseObserver) {
        log.info("server接收到{}请求",request.getFirstName());
        Greeting greeting = Greeting.newBuilder().setMessage("hello:" + request.getFirstName()).build();
        log.info("server处理请求结束");
        responseObserver.onNext(greeting);
        responseObserver.onCompleted();
    }
}
