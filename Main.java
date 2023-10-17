import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringJoiner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(scanner.nextInt());
        }
        for (Integer integer : queue) {
            System.out.print(integer + " ");        
        }
        System.out.println();
        queue.offer(scanner.nextInt());
        StringJoiner sj = new StringJoiner(" ");
        for (Integer integer : queue) {
            sj.add(integer.toString());
        }   
        System.out.println(sj.toString());                                     
        System.out.println(queue.peek());
        queue.poll();
        for (Integer integer : queue) {
            System.out.print(integer + " ");        
        }
    }
}