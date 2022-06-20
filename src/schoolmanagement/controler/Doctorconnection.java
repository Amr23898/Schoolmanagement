/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement.controler;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import schoolmanagement.model.Course;
import schoolmanagement.model.Doctor;

/**
 *
 * @author ElAbd
 */
public class Doctorconnection {
      Statement state;
      public void insert(Doctor doc){
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("insert into doctor (d_id,d_name,c_id) values "
                    + "( "+doc.getD_code()+",'"+doc.getD_name()+"','"+doc.getC_code()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Doctorconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
        public void update(Doctor doc){
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate("update doctor"
                    + " set d_name = '"+doc.getD_name()+"',c_id='"+doc.getC_code()+"' where d_id = "+doc.getD_code()+"");
        } catch (SQLException ex) {
            Logger.getLogger(Doctorconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
          public void delete(String id){
        try {
            state = (Statement) DBconection.getconnection().createStatement();
            state.executeUpdate
        ("delete from course where c_id = '"+id+"'");
        } catch (SQLException ex) {
            Logger.getLogger(Doctorconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
