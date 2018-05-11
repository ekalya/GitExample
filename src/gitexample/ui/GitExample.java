/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitexample.ui;

import gitexample.data.uStudent;

/**
 *
 * @author elisha
 */
public class GitExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        uStudent student;
        student = new uStudent();

        
        uStudent student2 = new uStudent();
        student2.setsName("King");
        student2.setxId(12);
        
        student2.setsName("King 2");
        student2.setxId(122);

        student.setsName("James");
        student.setxId(20);
        
        student.setsName("James 2");
        student.setxId(200);
        
        
        

    }
    
}
