import java.util.Scanner;

public class mergerList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int num;
        while ((num = sc.nextInt()) != 0) {
            list.addFirst(num);
        }
          System.out.println(list.toString());
        int insertIndex = sc.nextInt();
        int insertValue = sc.nextInt();
        list.insert(insertIndex, insertValue);
        System.out.println(list.toString());
        int deleteIndex = sc.nextInt();
        list.delete(deleteIndex);
        System.out.println(list.toString());
        int searchValue = sc.nextInt();
        int searchIndex = list.search(searchValue);
        System.out.println(searchIndex);
    }
}

class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = new Node(-1);
        size = 0;
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
        size++;
    }

    public void insert(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        Node node = new Node(val);
        node.next = cur.next;
        cur.next = node;
        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

    public int search(int val) {
        Node cur = head.next;
        int index = 0;
        while (cur != null) {
            if (cur.val == val) {
                return index;
            }
            cur = cur.next;
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = head.next;
        while (cur != null) {
            sb.append(cur.val).append(" ");
            cur = cur.next;
        }
        return sb.toString().trim();
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
}