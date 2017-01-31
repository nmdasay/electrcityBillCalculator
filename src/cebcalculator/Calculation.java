/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cebcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author Jayantha
 */
public class Calculation {
    double unicharge;
    double fixcharge;
    double total;
    public void calculate(double a){
        if (a<61){
            if(a<31){
                unicharge= a*2.5;
                fixcharge=30;
                
                sysout(unicharge, fixcharge);
                
             
            }
            else {
                double x =a-30;
                unicharge= 30*2.5+x*4.85;
                fixcharge=60;
               
                sysout(unicharge, fixcharge);
               
            }
        }
        else if(a<91){
            double x  = a-60;
            
            unicharge= 60*7.85+x*10;
                fixcharge=90;
               sysout(unicharge, fixcharge);
        }
       else if(a<121){ 
           double x  = a-90;
            
            unicharge= 60*7.85+30*10+x*27.75;
                fixcharge=480;
               sysout(unicharge, fixcharge);
            
        }
       else if(a<181){  double x  = a-120;
            
            unicharge= 60*7.85+30*10+30*27.75+x*32;
                fixcharge=480;
               sysout(unicharge, fixcharge);
            
        }
        else{double x  = a-180;
            
            unicharge= 60*7.85+30*10+30*27.75+60*32+x*45;
                fixcharge=540;
               sysout(unicharge, fixcharge);
            
        }
        
           
        
    }
     public void sysout(double uni ,double fix){
         unicharge=Math.floor(uni* 100) / 100;
        fixcharge=Math.floor(fix* 100) / 100;
         total=unicharge+fixcharge;
        JOptionPane.showMessageDialog(null, "Charge for Units cosumed "+unicharge+"\n"+"Fixed Charge is "+fixcharge+"\n"+"Total Cost is "+total);
}}
