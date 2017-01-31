/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cebcalculator;


import static java.lang.Math.toIntExact;
import java.util.Date;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.exception.JOniException;

/**
 *
 * @author Jayantha
 */
public class Validator {
    
    
    
    public double vali(int a,int b, Date c, Date d){
        double thirtydays=0;
       try{ double diference = b-a;
          
           
         
           
           
    long diff =  d.getTime()-c.getTime();
       long diffDays = diff / (24 * 60 * 60 * 1000);
      
      int days = toIntExact(diffDays);
          
    thirtydays= (diference/days) *30;
         if(diference<1||diffDays<1){
             JOptionPane.showMessageDialog(null, "Check input Values");
         }
   
    }

    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Please try again");
    }
        
           
     return  thirtydays;
}
}