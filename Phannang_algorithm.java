//stand sort algorithm (Phannang)

import java.util.Arrays;
public class Phannang_algorithm {
    int[] arr = {1, 3, 9, 4, 5, 6, 2, 8, 7, 10};

    public void standSort() {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Phannang_algorithm obj = new Phannang_algorithm();
        obj.standSort();
        System.out.println(Arrays.toString(obj.arr));
    }
}