import java.util.Arrays;

public class Somin {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 6, 5, 9};
        int[] tersdizi = new int[dizi.length];


        for (int i = dizi.length - 1; i >= 0; i--) {

            tersdizi[i] = dizi[dizi.length - 1 - i];
        }
        System.out.println(Arrays.toString(tersdizi));
    }
}
