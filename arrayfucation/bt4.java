package arrayfucation;

public class bt4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maxx = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxx) {
                    maxx = arr[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + maxx);
    }
}
