/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author buigi
 */
public class NewClass4 {
    public static boolean check(String s){
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return true;
        }
       return false;
    }
    
    public static void main(String[] args) {
        ArrayList<String> aray=new ArrayList<>();
        try (BufferedReader br = new  BufferedReader(new FileReader ("DATA.in"))){
            String line;
            while((line=br.readLine())!=null){
                line=line.trim();
                String[] arr=line.split("\\s+");
                for(String x:arr){
                   if(!check(x)){
                        try{
                            int u=Integer.parseInt(x);
                        }catch (Exception o){
                            aray.add(x);
                        }
                    }else {
                       aray.add(x);
                   }
                       
                }
            }
        }catch (Exception x){
                
            }
        Collections.sort(aray);
            for(String x:aray){
                System.out.print(x+" ");
            }
        
    }
    
}

