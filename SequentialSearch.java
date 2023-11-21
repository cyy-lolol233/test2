import java.util.Scanner;
public class SequentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int index = getIndex(arr, key);
        System.out.println();
        System.out.println(index);
    }

    public static int getIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}