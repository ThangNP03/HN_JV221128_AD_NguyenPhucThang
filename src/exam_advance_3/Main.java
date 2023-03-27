package exam_advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> danhSachPhuHuynh = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập tên phụ huynh nộp hồ sơ");
            System.out.println("2. Phụ huynh tiếp theo");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear input buffer
                    System.out.print("Nhập tên phụ huynh: ");
                    String tenPhuHuynh = scanner.nextLine();
                    danhSachPhuHuynh.add(tenPhuHuynh);
                    System.out.println("Phụ huynh đã được thêm vào danh sách!");
                    break;
                case 2:
                    if (danhSachPhuHuynh.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        String phuHuynhDauTien = danhSachPhuHuynh.poll();
                        System.out.println("Phụ huynh đầu tiên trong danh sách: " + phuHuynhDauTien);
                    }
                    break;
                case 3:
                    System.out.println("Chương trình đã kết thúc!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        }
    }
}
