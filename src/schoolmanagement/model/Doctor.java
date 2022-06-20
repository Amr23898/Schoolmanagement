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
public class Doctor {

    private static int d_code;
    private static String d_name;
    private static String c_code;

    public Doctor() {
    }

    public int getD_code() {
        return d_code;
    }

    public void setD_code(int d_code) {
        Doctor.d_code = d_code;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        Doctor.d_name = d_name;
    }

    public String getC_code() {
        return c_code;
    }

    public void setC_code(String c_code) {
        Doctor.c_code = c_code;
    }

}
