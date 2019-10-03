/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author maurice
 */
public class Student {
    
   Scanner scn = new Scanner (System.in);
    
     private String name, regNo;
     private int yob;
     int CourseWOrk;
     
    
    
    public Student(){
        
     
     
        System.out.print("enter marks for the student");
           System.out.println();
        
        System.out.print("Enter marks for OPP   :");
		
		int OPP = scn.nextInt();
		
		System.out.print("Enter marks for Computer Networks   :");
		
		int ComN = scn.nextInt();
		
		System.out.print("Enter marks for  Calculus  :");
		
		int Cal = scn.nextInt();
		
		System.out.print("Enter marks for WebDesign   :");
		
		int Web = scn.nextInt();
                
                System.out.print("Enter marks for Compuetr Application   :");
                
                int ComAp = scn.nextInt();
                
                System.out.print("Enter marks for Problem Solving     :");
                
                int ProbS = scn.nextInt();
		
		int sum = OPP + ComN +  Cal + Web + ComAp + ProbS;
		
		int Average = sum/6;
		System.out.println();
		
		System.out.print("sum = "+sum);
		System.out.println();
		
		System.out.print("Average = "+Average);
		
		System.out.println();
		System.out.println();
    }
    
    public Student(String name, String regNo, int yob) {
        
       this.name = name;
       this.regNo = regNo;
       this.yob = yob;
       
       
    }

    public Scanner getScn() {
        return scn;
    }

    public String getName() {
        return name;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getYob() {
        return yob;
    }

    public int getCourseWOrk() {
        return CourseWOrk;
    }

    public void setScn(Scanner scn) {
        this.scn = scn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setCourseWOrk(int CourseWOrk) {
        this.CourseWOrk = CourseWOrk;
    }
 
     
        
        
   
}

  
