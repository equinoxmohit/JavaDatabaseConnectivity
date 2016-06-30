/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohitpaudel.databaseconnectivity.dao.impl;

import com.mohitpaudel.databaseconnectivity.dao.CourseDao;
import com.mohitpaudel.databaseconnectivity.entity.Course;
import com.mohitpaudel.databaseconnectivity.util.DbConnectivity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public  class CourseDaoImpl implements CourseDao {

    DbConnectivity connect = new DbConnectivity();

    @Override
    public int insert(Course course) throws ClassNotFoundException, SQLException {
        connect.open();

        String sql = "INSERT INTO tbl_courses(course_name,course_description,duration,duration_type,fees,status)" + "VALUES(?,?,?,?,?,?)";
  
        PreparedStatement stmnt = connect.initStatements(sql);

   
        stmnt.setString(1, course.getCourse_name());
        stmnt.setString(2, course.getCourse_description());
        stmnt.setInt(3, course.getDuration());
        stmnt.setString(4, course.getDuration_type());
        stmnt.setInt(5, course.getFees());
        stmnt.setBoolean(6, course.isStatus());

       
        int result = connect.update();

        connect.close();
        
        return result;
    }

    @Override
    public ArrayList<Course> displayAll() throws ClassNotFoundException, SQLException {
        ArrayList<Course> courseList=new ArrayList<>();
        connect.open();
        
        String sql="SELECT * FROM tbl_courses";
        
        connect.initStatements(sql);
        ResultSet rs=connect.query();
            while(rs.next())
            {
                Course c=new Course();
                c.setCourse_id(rs.getInt("course_id"));
                c.setCourse_name(rs.getString("course_name"));
                c.setCourse_description(rs.getString("course_description"));
                c.setDuration(rs.getInt("duration"));
                c.setDuration_type(rs.getString("duration_type"));
                c.setFees(rs.getInt("fees"));
                c.setAdded_date(rs.getDate("added_date"));
                c.setModified_date(rs.getDate("modified_date"));
                c.setStatus(rs.getBoolean("status"));
                courseList.add(c);
            
            }

        connect.close();
        return courseList;
    
    }

    @Override
    public int delete(int id) throws ClassNotFoundException, SQLException {
        connect.open();
        
        String sql="DELETE  FROM tbl_courses WHERE course_id=?";
        
        connect.initStatements(sql);
        PreparedStatement statement=connect.initStatements(sql);
        statement.setInt(1, id);
       int res= connect.update();
        
        connect.close();
        return res;
        
        
        
    }

  
}
