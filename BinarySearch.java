import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int index = getIndex(arr, key);
        System.out.println();
        System.out.println(index);
        sc.close();
    }

    public static int getIndex(int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left+right)/2;
            System.out.print(arr[mid]+" ");
            if (key < arr[mid]) {
                right = mid-1;
            } else if (key > arr[mid]) {
                left = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}