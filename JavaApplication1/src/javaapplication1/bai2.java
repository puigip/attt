package javaapplication1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bai2 {
    public static int ucln(int a, int b) {
        if (a == 0 || b == 0) return a + b;
        if (a > b) return ucln(a % b, b);
        else return ucln(a, b % a);
    }

    public static long Mod = (int) 1e9 + 7;

    public static long ltnp(long a, long b) {
        long s = 1;
        a %= Mod;
        while (b != 0) {
            if (b % 2 == 1) {
                s *= a;
                s %= Mod;
            }
            a *= a;
            a %= Mod;
            b /= 2;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Số lượng test cases
        int kk = t;
        while (t-- > 0) {
            int n = sc.nextInt();  // Số phần tử trong mỗi test case
            LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                Integer x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);  // Tăng giá trị đếm cho mỗi phần tử
            }

            Set<Map.Entry<Integer, Integer>> tmp = mp.entrySet();  // Lấy tất cả các entry của Map
            System.out.println("Test " + (kk - t) + ":");
            for (Map.Entry<Integer, Integer> entry : tmp) {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
        sc.close();
    }
}
