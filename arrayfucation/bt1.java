package arrayfucation;
import java.util.Arrays;
import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        System.out.print("muốn xóa phần tử nào thì trừ đi 1 ví dụ muốn xóa 3 thì ghi là 2 muốn xóa 4 thì ghi là 3:");
        int inToRemove = scanner.nextInt();
        for (int i = inToRemove; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        myArray = Arrays.copyOf(myArray, myArray.length - 1);
        System.out.println(Arrays.toString(myArray));
    }
}
