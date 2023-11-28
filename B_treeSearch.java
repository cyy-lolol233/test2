public class B_treeSearch {             
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        B_treeSearch b_treeSearch = new B_treeSearch();
        System.out.println(b_treeSearch.getIndex(arr, 3));
    }

    public int getIndex(int[] arr, int key) {
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