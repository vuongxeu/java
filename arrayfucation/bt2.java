package arrayfucation;
import java.util.Arrays;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        int[] newArray = new int[myArray.length + 1];
        System.arraycopy(myArray, 0, newArray, 0, myArray.length);
        System.out.println("nhập gt cần thêm");
        newArray[newArray.length - 1] = scanner.nextInt();
        myArray = newArray;
        System.out.println(Arrays.toString(newArray));
    }
}
