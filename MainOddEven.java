import java.util.*;

public class MainOddEven {

    public static void main(String args[]) {
        int[] arr = {12, 27, 7, 4, 6, 2, 1, 5, 18};
        System.out.print(fun(arr));
    }

    public static List<Integer> fun(int[] arr) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                odd.add(arr[i]);
            else
                even.add(arr[i]);
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(odd);
        result.addAll(even);

        return result;
    }
}
