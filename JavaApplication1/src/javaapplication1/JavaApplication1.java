/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author maurice
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Scanner scn = new Scanner(System.in);
       // ArrayList names= new ArrayList();
       // String name;
       // name = new Scanner(System.in).nextLine();
        
        boolean action = false;

       
        Student std = new Student("John","25/789/BCS",23);
    
        
        Student std2 = new Student("Mary","25/789/BIT",19);
        
        Student std3 = new Student("Jack","90/UG/345/BIT",20);
       
        System.out.println("Student Name :"+" "+std.getName());
        System.out.println("Registration Number :"+""+std.getRegNo());
        System.out.println("Age :"+" "+std.getYob());
        
           Student learner;
        learner = new Student();
        
            
       //std2.setName("");
       System.out.println();
       System.out.println(std2.getName());
       System.out.println("Registration Number :"+" "+std2.getRegNo());
       System.out.println(" Age :"+" "+std2.getYob());
       
           Student learner2;
        learner2 = new Student();
        
      
        System.out.println();
       System.out.println(std3.getName());
       System.out.println("Registration Number :"+" "+std3.getRegNo());
       System.out.println(" Age :"+" "+std3.getYob());
       
          Student learner3;
       learner3 = new Student();
        
        
        
        }
     
    }
    
  