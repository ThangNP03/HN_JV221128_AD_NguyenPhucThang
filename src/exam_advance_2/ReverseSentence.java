package exam_advance_2;

import java.util.*;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        String sentence;
        int choice;

        do {
            System.out.println("\n****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Nhập câu");
            System.out.println("2. Đảo ngược câu");
            System.out.println("3. Thoát");

            System.out.print("\nChọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập câu: ");
                    sentence = sc.nextLine(); // consume the leftover newline character
                    sentence = sc.nextLine();
                    String[] words = sentence.split(" ");

                    for (String word : words) {
                        stack.push(word);
                    }

                    System.out.println("Câu của bạn đã được lưu vào stack!");
                    break;

                case 2:
                    System.out.print("Câu đảo ngược: ");

                    while (!stack.empty()) {
                        System.out.print(stack.pop() + " ");
                    }

                    System.out.println();
                    break;

                case 3:
                    System.out.println("Chương trình đã kết thúc!");
                    break;

                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }

        } while (choice != 3);

        sc.close();
    }
}
