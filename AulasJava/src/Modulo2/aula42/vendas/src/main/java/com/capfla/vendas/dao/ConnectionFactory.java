package com.capfla.vendas.dao;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;

public class ConnectionFactory {
    private DataSources dataSource;

    public ConnectionFactory() {
        ComboPooledDataSource pool = new ComboPooledDataSource();
        this.dataSource = pool;
    }

    public Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
