package huongdoituong;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author buigi
 */
public class newJavaFile {
    public static class  Sv{
        int stt;
        String msv,ten,lop,email,lam;

        public Sv(int stt, String msv, String ten, String lop, String email, String lam) {
            this.stt = stt;
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
            this.lam = lam;
        }

        public String getLam() {
            return lam;
        }

        public String getTen() {
            return ten;
        }

 
        public void chuanhoa(){
            String[] tmp= this.ten.split("\\s+");
            String a="";
          for(String x:tmp){
              x=x.substring(0,1).toUpperCase()+x.substring(1,x.length()).toLowerCase();
              a+=x+" ";
          }
       a= a.trim();
          this.ten=a;
        }

        public String getMsv() {
            return msv;
        }

        @Override
        public String toString() {
            return  stt+" "+msv+" "+ten+" "+lop+" "+email+" "+lam;
        }
    }    
   
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       Sv[] a=new Sv[t];
       int c=t;
         int n=1;
         sc.nextLine();
       while(t-- >0){
           a[n-1] = new Sv(n,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()); a[n-1].chuanhoa();
           n++;
       }
       Arrays.sort(a,new Comparator<Sv>(){
           @Override
           public int compare(Sv o1, Sv o2) {
               return  o1.getMsv().compareTo(o2.getMsv());
           }
           
       });
       int q=sc.nextInt();
       sc.nextLine();
       String[] tv=new String[q];
       for(int i=0;i<q;i++){
           tv[i]=sc.next();
       }
       for(String x:tv){
           for(int i=0;i<c;i++){
             if(x.equals(a[i].getLam())) System.out.println(a[i].toString());
           }
       }
       
    }
}
