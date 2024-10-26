/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author buigi
 */
public class NewClass2 {
    public static void main(String[] args) {
        TreeMap<String,Integer> mp=new TreeMap<>();
            TreeSet<String> set=new TreeSet<>();
      try ( BufferedReader br=new BufferedReader(new FileReader("VANBAN.in"))){
          String line;
          int u=1;
          while((line=br.readLine())!=null){
              String[] rr=line.split("\\s+");
          
                 for(String x:rr){
                  x=x.toLowerCase();
                  set.add(x);
              }
            
          }
          
      }catch(Exception x){
          
      }
     for(String x:set){
         System.out.println(x);
     }
       
    }
}
