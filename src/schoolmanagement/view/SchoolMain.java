package schoolmanagement.view;


import java.util.ArrayList;
import schoolmanagement.controler.Courseconection;
import schoolmanagement.controler.Doctorconnection;
import schoolmanagement.controler.Studentconection;
import schoolmanagement.model.Course;
import schoolmanagement.model.Doctor;
import schoolmanagement.model.Student;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ElAbd
 */
public class SchoolMain {

    public static void main(String[] args) {

        //Number of student in each Course
        Studentconection st = new Studentconection();
        Student s = new Student();
        System.out.println("");
        System.out.println("Number of courses =" + st.numberofstudent("cs"));
        System.out.println( "Names of courses "+st.nameofcourse_student("amr"));
        
        
        
        
        
        //COurse for each Doctor 
        
        Courseconection con = new Courseconection();
        ArrayList<String> co = new ArrayList<String>();
        co = con.nameofcourse_doctor("ahmed");
        System.out.println("Doctor teach : "+co);
        
        //

    }
}
