package bai_tap_2_hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int choice;
            System.out.println("1. Print the rectangle\n" +
                    "2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "3. Print isosceles triangle\n" +
                    "4 .Exit\n");
            System.out.println("please enter choice");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào chiều dài");
                    int width = input.nextInt();
                    System.out.println("Nhập vào chiều rộng");
                    int height = input.nextInt();
                    drawRectangles(width, height);

                case 2:
                    System.out.println("Nhập vào độ dài cạnh góc vuông");
                    int canh = input.nextInt();
                    drawTriangle(canh);
                case 3:
                    System.out.println("Nhập vào độ dài chiều cao tam giác");
                    int h = input.nextInt();
                    drawCanTriangle(h);

                case 4:
                    System.out.println("Thoát chuơng trình");
                    System.exit(0);
                default:
                    System.err.println("lựa chon không hợp lệ");
                    break;
            }
        }
    }

    public static void drawRectangles(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(int width) {
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("In hình tam giác vuông, có cạnh góc vuông ở top-left   ");
        for (int i = width; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void drawCanTriangle(int height) {
        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= 2 * height - 1; j++) {

                if (j >= height - i + 1 && j <= height + i - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }


}
