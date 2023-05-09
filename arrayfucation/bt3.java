package arrayfucation;
import java.util.Arrays;
public class bt3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int[] resul = new int[array1.length + array2.length];
        System.arraycopy(array1, 0, resul, 0, array1.length);
        System.arraycopy(array2, 0, resul, array1.length, array2.length);
        System.out.println(Arrays.toString(resul));
    }
}
