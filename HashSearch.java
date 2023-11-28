import java.util.Scanner;
public class HashSearch {
    static  int SIZE = 20;
    static int[] hashTable = new int[SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            hashInsert(key);
        }
        int searchKey = scanner.nextInt();
        for (int i : hashTable) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(hashSearch(searchKey));
        scanner.close();
    }

    // 除留余数法
    static void hashInsert(int key) {
        int index = key % 19;
        // 线性探测处理hash冲突
        while (hashTable[index] != 0) {
            index = (index + 1) % SIZE;
        }
        hashTable[index] = key;
    }

    static int hashSearch(int key) {
        int index = key % 19;
        // 如果不是要找的key，就一直往后找
        while (hashTable[index] != key) {
            // 如果找到空位了，说明没有要找的key
            if (hashTable[index] == 0) {
                return -1;
            }
            // 如果找到最后一个位置了，就从头开始找
            index = (index + 1) % SIZE;
        }
        return index;
    }
}
