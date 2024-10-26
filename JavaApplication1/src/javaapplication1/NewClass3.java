/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author buigi
 */
public class NewClass3 {
    public static String chuanhoa(String s){
           s = s.trim();
      s=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
      return s;
    }
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
      try ( BufferedReader br = new BufferedReader(new FileReader("DATA.in"))){
          String line ;
          while((line=br.readLine())!=null){
              line=line.trim();
              String[] arr=line.split("\\s+");
              String tmp="";
              for(String x:arr){
                 x=chuanhoa(x);
                 tmp+=x+" ";
              }
              if (tmp.equals("End ")) {
                break;
            }
            a.add(tmp);
              
          }
      }catch (Exception x){
          
      }
      for(String x:a){
          System.out.println(x);
      }
    }
}
