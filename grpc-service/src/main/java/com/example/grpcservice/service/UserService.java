package com.example.grpcservice.service;


import com.example.grpcservice.user_info.tables.pojos.User;

public interface UserService{

    User getUserById(int id);

}