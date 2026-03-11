package baitap;

import java.util.Scanner;

public class Java_Session04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum_chan = 0;
        long sum_le = 0;
        System.out.print("Nhập số hàng của mảng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Phần tử ["+i+"]"+"["+j+"]: ");
                a[i][j] = sc.nextInt();
                if (a[i][j] % 2 == 0) sum_chan += a[i][j];
                else sum_le += a[i][j];
            }
        }
        System.out.println("Tổng các số chẵn: " + sum_chan);
        System.out.println("Tổng các số lẻ: "+ sum_le);
    }
}
