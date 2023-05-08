package arrayfucation;
import java.util.Arrays;
public class maxx {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                arr[i]=max;
            }
            System.out.println(max);
        }
    }
}
