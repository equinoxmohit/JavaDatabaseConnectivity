/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.databaseconnectivity.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mohit
 */
public class DbConnectivity {

    Connection conn = null;
    PreparedStatement stmnt = null;

    public void open() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost/coursedb", "root", "");

    }

    public PreparedStatement initStatements(String sql) throws SQLException {
        return stmnt = conn.prepareStatement(sql);

    }

    public int update() throws SQLException {
        return stmnt.executeUpdate();
    }
    
    public ResultSet query() throws SQLException
    {
        return stmnt.executeQuery();
    }

    public void close() throws SQLException {

        if (conn != null && !conn.isClosed()) {
            conn.close();
        }

    }
}
