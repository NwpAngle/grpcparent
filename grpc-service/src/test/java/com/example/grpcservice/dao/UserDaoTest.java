package com.example.grpcservice.dao;

import com.example.grpcservice.user_info.tables.records.UserRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.tools.jdbc.MockConnection;
import org.jooq.tools.jdbc.MockDataProvider;
import org.jooq.tools.jdbc.MockExecuteContext;
import org.jooq.tools.jdbc.MockResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.Collections;

import static com.example.grpcservice.user_info.tables.User.USER;

@Slf4j
@RunWith(SpringRunner.class)
public class UserDaoTest {

    @Test
    public void testQuery(){

        MyProvider myProvider = new MyProvider();
        MockConnection mockConnection = new MockConnection(myProvider);
        DSLContext dslContext = DSL.using(mockConnection, SQLDialect.MYSQL);
        //UserRecord userRecord = dslContext.selectFrom(USER).fetchOneInto(USER);
        Result<UserRecord> result = dslContext.selectFrom(USER).where(USER.ID.eq(3)).fetch();
        System.out.println(result);
    }

}

class MyProvider implements MockDataProvider{

    public MockResult[] execute(MockExecuteContext mockExecuteContext) throws SQLException {
        DSLContext create = DSL.using(SQLDialect.MYSQL);
        MockResult[] mockResults = new MockResult[2];

        String sql = mockExecuteContext.sql();
        System.out.println("--------------------sql:"+sql);

        if (sql.toUpperCase().startsWith("SELECT")){
            Result<Record3<Integer, String, String>> result = create.newResult(USER.ID, USER.FIRST_NAME, USER.LAST_NAME);
            result.add(create.newRecord(USER.ID,USER.FIRST_NAME,USER.LAST_NAME).values(1,"z","x"));
            result.add(create.newRecord(USER.ID,USER.FIRST_NAME,USER.LAST_NAME).values(1,"z","x"));
            mockResults[0] = new MockResult(1,result);
        }else {
            throw new SQLException("Statement not supported");
        }
        return mockResults;
    }
}