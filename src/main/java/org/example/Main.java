import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = 10 - i;
        }

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));
    }
}
