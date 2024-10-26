/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test802;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class Bai2 {
    public static boolean check(String s,int k){
        long du=0;
        for(int i=0;i<s.length();i++){
            du=du*10+(s.charAt(i)-'0');
            du%=k;
        }
        if (du==0) return true;
        else return false ;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(),arr1=new ArrayList<>();
        for(int i=0;i<100;i++){
            arr.add(sc.next());
        }
        
        for(int i=0;i<arr.size();i++){
             arr1.add("peter");
            arr1.add(arr.get(i));
           
        }
       for(String x:arr1){
           System.out.println(x);
       }
        
    }
    
    
}
