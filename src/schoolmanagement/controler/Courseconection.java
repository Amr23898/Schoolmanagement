/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement.controler;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmanagement.model.Course;

/**
 *
 * @author ElAbd
 */
public class Courseconection {
    Statement state;
      public void insert(Course c){
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("insert into course (c_id,c_name,d_name) values ('"+c.getCode()+"','"+c.getName()+"','"+c.getDoc_name()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Courseconection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public void update(Course c){
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("update course set c_name = '"+c.getName()+"',d_name='"+c.getDoc_name()+"' where c_id = '"+c.getCode()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Courseconection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
          public void delete(String id){
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate
        ("delete from course where c_id = '"+id+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Courseconection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
          ///////////////////////////////////
       public ArrayList<String> nameofcourse_doctor(String d_name) {
           ArrayList<String> course= new ArrayList<String>();
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            ResultSet result = state.executeQuery("select * from course where d_name = '" + d_name + "'");
            result.beforeFirst();
            while (result.next()) {
               course.add(result.getString(1));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Studentconection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return course;
    }
    
}
