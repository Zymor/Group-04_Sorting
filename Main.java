import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Phannang_algorithm obj = new Phannang_algorithm();
        obj.standSort();
        nak obj1 = new nak();
        obj1.exchangeSort();
        Phaleng_algorithm obj2 = new Phaleng_algorithm();
        obj2.insertionSort();
        Davy_algorithm obj3 = new Davy_algorithm();
        obj3.selectionSort();
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(obj1.arr));
        System.out.println(Arrays.toString(obj2.arr));
        System.out.println(Arrays.toString(obj3.arr));
    }
}
