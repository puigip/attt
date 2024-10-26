/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author buigi
 */

public class bai4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] tmp = s1.split("\\s+");
            String[] tmp1=s2.split("\\s+");
            String xo=null;
            for(int i=0;i<tmp1.length;i++){
                for(int j=0;j<tmp.length;j++){
                    if(tmp[j].equals(tmp1[i])){
                       // System.out.println("YES");
                        tmp[j]="";
                    }
                }
            }
            ArrayList<String> ss=new ArrayList<>();
            TreeSet<String> set=new TreeSet<>();
            for(int i=0;i<tmp.length;i++){
                if(tmp[i].length()!=0){
                    set.add(tmp[i]);
                }
            }
           
   
            for(String x:set){
              if(x.length()!=0)  System.out.print(x+" ");
            }
            System.out.print("\n");
        }
    }
    
}

