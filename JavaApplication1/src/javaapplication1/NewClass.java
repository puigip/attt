
package javaapplication1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NewClass {
    // lowerbound(a,0,n-1,x);
    public static int lowerbound(int[] a , int l ,int r , int x){ 
        if(l>r) return r+1;
        int mid=(l+r)/2;
        if(a[mid]>=x){
            return Math.min(mid,lowerbound( a, l, mid-1,x));
        }else{
            return lowerbound(a,mid+1,r,x);
        }         
    }
    
    
    // psvm tab

    public static void main(String[] args) {
        // sout tab
        System.out.println("gipa");
        // long 8 byte int 4 byte
        // double 8 byte fl 4 byte 
        // char 1 byte 'A'
        // boolean
        //String xau ki tu "A"  
   
             
        String xx = "gaif";
        double dienTich=123.123;
        float banKinh=999;
        System.out.println(xx);
        // System.out.printf("%.4f\n",giaTriThapPhan); lam tron so 
        System.out.print(dienTich+" "+banKinh+" "+xx+"endl");
        Scanner sc = new Scanner(System.in); // khai bao cai doc datu tu ban phim
        int x=sc.nextInt();
        // phep chia / la phep chia nguyen =>> ep kieu float a=(float) c/bv
       //Math.abs Math.max Math.ceil ( lamtronlen) Math.floor(lam tronxuong) 
      // datatype [] tenmang = new datatype[sl]
      // datatype[][] tenmang = new datatype[sl][sl]
      // Arrays.sort() tu có cơ chế giữ nguyên vị trí ban đầu nếu có cùng điều kiện 
     
     
      
      
      
      // Wraper Interger Long Double Float Character
      // chuyen tu chuoi sang so int n = Interger.parseInt(sc.nextLine())  khong can xoa phim enter co the dung luon string s=sc.nextLine*(
      // ArrayList<Integer>  arr  = new ArrayList<>(); ( bang vector) ArrayList chi luu cac wrraper
      // ArrayList<ArrayList<Interger>> arr = new ArrayList<>(); mang 2 chieu
      // arr.add(type); them du lieu vao arrlist
      //arr.size() ; tra ve do dai cua arrlist
      //arr.get(index) // truy cap phan tu trong index
      //Collections.sort(arrlist) 
      // cmp cho quicksort ( chi ap dung cho kdl la object)
      // arr.set(index,element) thay doi gia tri ow mot vi tri
      Arrays.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                
            }
          
      });
      
      // SET
      //HashSet<Integer> st = new Hashset<>(); tinh duy nhat 
      // LinkedHashSet<Integer> st = new LinkedHashset<>() ; tinh duy nhat ,không sắp xếp , tính thứ tự  
      //TreeSet<Integer> st = new Treesset<> () ; tinh duy nhat , tinh tang dan => set.first() ,set.last()
       // st.add() , st.first() , st.last() 
       // st.contains() tim kiem phan tu trong set 
       // duyet set 
       for(int x : st){
          // x la phan tu trong set
       }
      }
      // Map 
    // HashMap<Integer,Integer> mp=new HashMap<>();
    //LinkedHashMap<Integer,Integer> mp= new LinkedHashMap<>();
    // mp.put(key,value);
    // truy nhap toi 1 key laf mp.get(key)
    // map.contaionsKey(keY) tra ve gia tri boolean tim kiem KEY co ton tai khong 
    // mp.put(x, mp.getOrDefault(x, 0) + 1); getOrDefault 
    HashMap<Integer,Integer> mp=new HashMap<>();
    Map.input(1,(số 2 ở dạng int phải ép kiểu nếu value ở dạng long long )2);
    
   Set<Map.Entry<Integer,Integer>> entrys=mp.entrySet();
    for(Map.Entry<Integer,Integer>> x:entrys){
     x.getKey x.getValue
}
    
    
    //Strings 
    //s.lenght() 
    //s.charAt() // có điều kiện
    //s.concat(t)
    //t=s.toLowerCase() //s khong bi thay doi
    //t=s.toUpperCase() // s khong bi thay doi  
    //s=s.toUpperCase() // thay doi s  do bi gan lai
    //s=s.trim() // xoa bo dau cách
    // s.equals(t) // true flase , so sánh về mặt nội dung 
    // không có so sánh xâu s==t 
    //s.compareTo(t) , s>t >1 , s==t =0 ,s<t =-1;
    //s.compateToIgnoreCase(t) so sánh 2 xâu k phân biệt hoa thường 
    //t=s.substring(0,5) cat tu 0-4 luôn phải có điều kiện
    //s.contains(t) check xem t có nằm trong s không  trả vè true flas
    //s=s.replace("9","AVC") thay thế chỗ nào có 9 là AVC
    //char[] a=s.toCharArrays()
    //String s=sc.next(); không đọc được dấu " " = cin 
    //Strings s=sc.nextLine() = getline(cin,s) đọc được cách và bị trôi lệnh , xử lí trôi lệnh thêm sc.nextline() ở trên
    // char x=sc.nextline().charAt(0) lấy ra kí tự đầu tiên trong xâu
    //String[] Arr =new s.split(" "); // chỉ tách ra 1 dấu cách
    // String[] Arr = new s.split("\\s+"); 
    // StringBuilder tmp=new StringBuilder(s);
    // tmp.deleteCharAt(tmp.length()-1) ;
    //s=s+t;    
    //System.out.printf(tmp.toString) in 1 stringbuilder
    //int n=Integer.pareInt(s) chuyển xâu thành số 
    //srings s=n+""  chuyển số thành xâu
    //Character.islowerCase('2') check xem co phari in thuwognf không  
    //KHÔNG GÁN ĐC TÙNG PHẦN TỬ TRONG STRING MÀ CHỈ GÁN ĐC CẢ STRING
    
    //
    
    
    
    
    // BigInteger 
    // BigInteger a = new BigInteger (string) bắt buộc có tham số string khai báo gán giá trị bằng chuỗi 
    // String t= a.toString()  từ BigInteger về chuỗi 
//    /long longValue = bigInt1.longValue(); từ Big về long 
    //  BigInteger sum = bigInt1.add(bigInt2);
    // BigInteger product = bigInt1.multiply(bigInt2);
    // BigInteger result = bigInt1.subtract(bigInt2);
     // BigInteger result = bigInt1.divide(bigInt2); 
     // BigInteger result = bigInt1.pow(3);  // bigInt1^3
    // BigInteger result = bigInt1.mod(bigInt2);
    // int comparison = bigInt1.compareTo(bigInt2); so sánh 


}
