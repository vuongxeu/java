package arrayfucation;

public class bt5 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 3, 1, 8};

        int minn = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minn) {
                minn = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minn);
    }
}
