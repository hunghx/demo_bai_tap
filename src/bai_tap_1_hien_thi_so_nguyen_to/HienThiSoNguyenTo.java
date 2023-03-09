package bai_tap_1_hien_thi_so_nguyen_to;

import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố đầu tiên cần in ra :");
        int soLuong = input.nextInt();
        int count = 0;
        int n=2;
        while (true){
            if(kiemTraSoNT(n)){
                System.out.println(n);
                count++;
            }
            n++;
            if (count==soLuong) {
                break;
            }
        }
    }
    public static boolean kiemTraSoNT(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }
}
