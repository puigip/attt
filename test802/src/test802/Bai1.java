package test802;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//class ten-class
// public ktv tên hàm 



/**
 *
 * @author buigi
 */
public class Bai1 {
     public static int check(String s){
         int l=0,r=s.length()-1;
         while(l<=r){
             if(s.charAt(l)!=s.charAt(r)) return 0;
               l++;r--;
         }
         return 1;
     }
     
    public static int lowerBound(ArrayList<Long> a,int l,int r,long key){
        while(l<=r){
            int m=(l+r)/2;
            if(a.get(m)<key){
                l=m+1;
            }
            else if(a.get(m)>key) r=m-1;
            else return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         while(t-- >0){
             int n=sc.nextInt();
             long m=sc.nextLong();
             ArrayList<Long> a=new ArrayList<>();
             for(int i=0;i<n;i++){
                 a.add(sc.nextLong());
             }
             long cnt=0;
             int l=0;
             int ok=0;
             for(int i=0;i<n;i++){
                 cnt+=a.get(i);
                 while(cnt>m&&l<=i){
                     cnt-=a.get(l++);
                }
                 if(cnt==m) ok=1;
             }
             if(ok==0) System.out.println("NO");
             else System.out.println("YES");
         }
      }
}