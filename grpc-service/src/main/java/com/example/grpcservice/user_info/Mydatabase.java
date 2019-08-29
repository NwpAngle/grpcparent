/*
 * This file is generated by jOOQ.
*/
package com.example.grpcservice.user_info;


import com.example.grpcservice.user_info.tables.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mydatabase extends SchemaImpl {

    private static final long serialVersionUID = -1353699822;

    /**
     * The reference instance of <code>mydatabase</code>
     */
    public static final Mydatabase MYDATABASE = new Mydatabase();

    /**
     * The table <code>mydatabase.user</code>.
     */
    public final User USER = com.example.grpcservice.user_info.tables.User.USER;

    /**
     * No further instances allowed
     */
    private Mydatabase() {
        super("mydatabase", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            User.USER);
    }
}
