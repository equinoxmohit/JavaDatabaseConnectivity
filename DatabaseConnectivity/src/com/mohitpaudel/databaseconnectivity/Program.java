/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.databaseconnectivity;

import com.mohitpaudel.databaseconnectivity.dao.CourseDao;
import com.mohitpaudel.databaseconnectivity.dao.impl.CourseDaoImpl;
import com.mohitpaudel.databaseconnectivity.entity.Course;
import com.mohitpaudel.databaseconnectivity.util.DbConnectivity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Mohit
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CourseDao cDao = new CourseDaoImpl();
           int result = cDao.insert(new Course(0, "Basic Java", "Basic Java Course", 6, "Week", 12000, true));
//            System.out.println(result);
            
//            cDao.displayAll().forEach(c->{
//            
//            
//                System.out.println(c.toString());
//            
//            
//            });
           
        // cDao.delete(1);
            
        } catch (ClassNotFoundException | SQLException ce) {
            System.out.println(ce.getLocalizedMessage());
        }
    }

}
