/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement.model;

/**
 *
 * @author ElAbd
 */
public class Student {

    private static int s_id;
    private static String s_name;
    private static int s_year;
    private static String c_id;
    private static int d_id;

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        Student.d_id = d_id;
    }

    public Student() {
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        Student.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        Student.s_name = s_name;
    }

    public int getS_year() {
        return s_year;
    }

    public void setS_year(int s_year) {
        Student.s_year = s_year;
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        Student.c_id = c_id;
    }

}
