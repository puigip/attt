/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class diachiemail {
    public static String change (String s){
        s=s.trim();
        String[] tmp=s.split("\\s+");
        String t="";
        for(int i=0;i<=tmp.length-1;i++){
            if(i!=tmp.length-1&&tmp[i].length()!=0){
                t+=tmp[i].charAt(0);
            }
            else {
                t=tmp[i]+t;
                t=t.toLowerCase();
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList<String> s=new ArrayList<>();
        while(t-- >0){
            s.add(sc.nextLine());
        }
        HashMap<String,Integer>  mp = new HashMap<>();
        ArrayList<String> ss=new ArrayList<>();
        for(int i=0;i<s.size();i++){
            s.set(i,change(s.get(i)));
            if(mp.containsKey(s.get(i))){
                int v=2;
                while(mp.containsKey(s.get(i)+v+"")){
                v++;
                }
                String tt=s.get(i)+v+"";
                mp.put(tt,v);
                ss.add(tt);
            }
            else{
                ss.add(s.get(i));
                mp.put(s.get(i), 1);
            }
        }
        for(String x:ss){
            System.out.println(x+"@ptit.edu.vn");
        }
    }
}
