package arrayfucation;

import java.util.Scanner;

public class timgiatri {
    public static void main(String[] args) {
        String[] hs ={"vuong","tungsmai","thanhc","duongmp","quanap"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên học xưn");
        String ten = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < hs.length; i++) {
                if (hs[i].equals(ten)) {
                    System.out.println("Position of the students in the list " + ten + " is: " + i);
                    check= true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Not found" + ten+ " in the list.");
            }

        }
    }

