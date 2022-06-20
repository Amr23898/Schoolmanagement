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
import schoolmanagement.model.Student;

/**
 *
 * @author ElAbd
 */
public class Studentconection {

    Statement state;

    public void insert(Student stu) {
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("insert into student (s_id,s_name,s_years,c_id,d_id) values "
                    + "( " + stu.getS_id() + ",'" + stu.getS_name() + "'," + stu.getS_year() + ",'" + stu.getC_id() + "'," + stu.getD_id() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(Studentconection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Student stu) {
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("update student"
                    + " set s_name = '" + stu.getS_name() + "',s_years=" + stu.getS_year() + ",c_id='" + stu.getC_id() + "',d_id=" + stu.getD_id() + ""
                    + " where s_id = " + stu.getS_id() + "");
        } catch (SQLException ex) {
            Logger.getLogger(Studentconection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("delete from student where s_id = " + id + "");
        } catch (SQLException ex) {
            Logger.getLogger(Studentconection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ///////////////////////////////////////////////////////////
    public int numberofstudent(String c_id) {
        int temp = 0;
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            ResultSet result = state.executeQuery("select * from student where c_id = '" + c_id + "'");
            result.beforeFirst();
            while (result.next()) {
                temp = temp + 1;

            }
        } catch (SQLException ex) {
            Logger.getLogger(Studentconection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    //////////
     public ArrayList<String> nameofcourse_student(String s_name) {
           ArrayList<String> student_course= new ArrayList<String>();
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            ResultSet result = state.executeQuery("select * from student where  s_name= '" + s_name + "'");
            result.beforeFirst();
            while (result.next()) {
               student_course.add(result.getString(3));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Studentconection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student_course;
    }
}
