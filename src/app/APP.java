/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author This PC
 */
public class APP {

    
    
    /**
     * @param args the command line arguments
     */
    
    
 public   ArrayList<Student> task()
 {
     Scanner sc=new Scanner(System.in);
     String Basesubject[]=new String[10];
     for(int t=0;t<10;t++)
     {
         Basesubject[t]="SUBJECT"+(t+1);
     }
     int n;
     n=sc.nextInt();
     ArrayList<Student> st=new ArrayList<Student>();
     int baseRollNo=16303000;
     Random rand = new Random();
     
     for(int i=1;i<=n;i++)
     {
         Student stu=new Student();
        
         stu.stuname="Student"+i;
         stu.rollno=baseRollNo + i;
         stu.Marks=new int[5];
         stu.Subject=new String[5];
         for(int j=0;j<5;j++)
         {    
             int m=0;
             stu.Subject[j]=Basesubject[rand.nextInt(9)];
             stu.Marks[j]=rand.nextInt(60)+40 ;
             
             for(int c=0;c<j;c++)
             {
               if(stu.Subject[c]==stu.Subject[j])
               {
                 stu.Subject[j]=Basesubject[rand.nextInt(9)];  
               } 
             }
             }
         
         
        st.add(stu);
     }
     return st;
     
 }
    public static void main(String[] args)
    {
      
        APP app=new APP();
        ArrayList<Student> st=app.task();
        
        for(int i = 0; i < st.size(); i++)
        {
            System.out.println(st.get(i).stuname);
            System.out.println(st.get(i).rollno);
            int Marks[]=st.get(i).Marks;
            String Subject[]=st.get(i).Subject;
            for(int k=0;k<5;k++)
            {
              System.out.println(Subject[k]+"="+Marks[k]);  
            }
            
            
        }
    
    }
    
}




