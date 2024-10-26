/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class NewClass1 {
    public static long ucln(long a,long b){
        if(a==0||b==0) return a+b;
        if(a>b) return ucln(a%b,b);
        else return ucln(a,b%a);
    }
    public static void main(String[] args){
        String s="  ";
        String[] sx=s.split("\\s+");
        System.out.println(sx.length);
    }
    
}
