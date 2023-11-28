import java.util.Scanner;
public class HashSearch {
    static final int SIZE = 20;
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
    }

    static void hashInsert(int key) {
        int index = key % 19;
        while (hashTable[index] != 0) {
            index = (index + 1) % SIZE;
        }
        hashTable[index] = key;
    }

    static int hashSearch(int key) {
        int index = key % 19;
        while (hashTable[index] != key) {
            if (hashTable[index] == 0) {
                return -1;
            }
            index = (index + 1) % SIZE;
        }
        return index;
    }
}
