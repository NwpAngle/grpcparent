package com.example.grpcservice.service.impl;

import com.example.grpcservice.service.UserService;
import com.example.grpcservice.user_info.Tables;
import com.example.grpcservice.user_info.tables.daos.UserDao;
import com.example.grpcservice.user_info.tables.pojos.User;
import com.example.grpcservice.user_info.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author niuweipeng
 */
@Service
public class UserServiceImpl implements UserService{

    public UserServiceImpl(DSLContext dslContext){
        this.dslContext = dslContext;
        this.userDao = new UserDao(dslContext.configuration());
    }

    DSLContext dslContext;

    UserDao userDao;

    public User getUserById(int id) {
        UserRecord result = dslContext.select().from(Tables.USER).where(Tables.USER.ID.eq(1))
                .fetchOneInto(Tables.USER);
        if (result != null){
            return userDao.mapper().map(result);
        }
        return null;
    }
}