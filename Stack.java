
 interface IStack {
    /**
     * 将元素 x 压入栈顶
     */
    void push(int x) throws Exception;

    /**
     * 弹出栈顶元素并返回
     * 如果栈为空
     */
    int pop() throws Exception;

    /**
     * 返回栈顶元素但不弹出
     */
    Object peek();

    /**
     * 判断栈是否为空
     */
    boolean isEmpty();

    /**
     * 返回栈中元素的数量
     */
    int size();
}

 class ArrayStack implements IStack {
    private int[] data;
    private int top;

    public ArrayStack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    @Override
    public void push(int x) throws Exception{
        if (top == data.length - 1) {
            throw new Exception("栈已满");
        }
        data[++top] = x;
    }

    @Override
    public int pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("栈为空"); 
        }
        return data[top--];
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
          return null;  
        }
        return data[top];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public int size() {
        return top + 1;
    }
    public void display() {
        for (int i = size()-1; i >=0; i--) {
            System.out.print(data[i] + " ");

        }
        System.out.println();
    }
}
public class Stack {
    public static void main(String[] args) throws Exception{
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        ArrayStack stack = new ArrayStack(n+1);  
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        stack.display();
        int x = scanner.nextInt();
        stack.push(x);
        stack.display();
        stack.pop();
        stack.display();
        
    }
}