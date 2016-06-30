/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.databaseconnectivity.dao;

import com.mohitpaudel.databaseconnectivity.entity.Course;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public interface CourseDao {

    int insert(Course course) throws ClassNotFoundException, SQLException;

    ArrayList<Course> displayAll() throws ClassNotFoundException, SQLException;

    int delete(int id) throws ClassNotFoundException, SQLException;

    

    

}
