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
public class Course {

    private static String cou_code;
    private static String cou_name;
    private static String doc_name;

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        Course.doc_name = doc_name;
    }

    public Course(String c, String n) {
        this.cou_code = c;
        this.cou_name = n;
    }

    public Course() {
    }

    public void setCode(String code) {
        Course.cou_code = code;
    }

    public String getCode() {
        return cou_code;
    }

    public void setName(String name) {
        Course.cou_name = name;
    }

    public String getName() {
        return cou_name;
    }

}
