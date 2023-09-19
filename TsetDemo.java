
import java.util.Arrays;
import java.util.Scanner;

 
//线性表之顺序表
 class SqList {
    private final int maxLength;//最大长度
    private int curLength;//当前长度
    private Object[] list;//存储数据元素的空间
 
    public SqList(int maxSize) {//构造方法，以参数maxSize作为顺序表的最大容量
        maxLength = maxSize;
        list = new Object[maxSize];
    }
 
    //清空
    public void clear() {
        curLength = 0;
    }
 
    //是否为空
    public boolean isEmpty() {
        return curLength == 0;
    }
 
    //是否满
    public boolean isFull() {
        return curLength == maxLength;
    }
 
    //获取当前表的长度
    public int getCurLength() {
        return curLength;
    }
 
    //根据下标返回对应的数据
    public Object getElem(int i) throws Exception {
        if (i < 0 || i > curLength) {
            throw new Exception("-1");
        }
        return list[i];
    }
 
    //根据数据元素找到对应的所在位置下标
    public int getIndex(Object e) throws Exception {
        for (int i = 0; i < curLength; i++) {
            if (list[i].toString().equals(e.toString())) {//内容全部相同
                return i;
            }
        }
        //抛异常不用返回值
        throw new Exception("不存在你要查找的元素");
    }
 
    //插入数据
    public void insert(int i, Object e) {
        if (isFull()) // 判断顺序表是否已满
        {//进行扩容
            System.out.println("顺序表已满,已扩容");
            list = Arrays.copyOf(list, 2 * curLength);
        }
        if (i < 0 || i > curLength) // i小于0或者大于表长
            System.out.println("插入位置不合理，插入失败");// 输出错误提示
        else {
            //把在list[i]之前的数据往后移一，以便插入
            for (int j = curLength - 1; j >= i; j--) {
                list[j + 1] = list[j];
            }
 
            list[i] = e;
            curLength++;//当前长度必须增加1
            
        }
    }
 
    //删除
    public void delete(int i) {
        if (i < 0 || i > curLength - 1) // i小于0或者大于表长
            System.out.println("删除位置不合理");
        else {
 
            for (int j = i; j < curLength - 1; j++) {
                list[j] = list[j + 1];
            }
            curLength--;//当前长度必须减少1
            
        }
 
    }
 
    //修改数据
    public void update(int i, Object reUp) throws Exception {
        for (int j = 0; j < curLength; j++) {
            //遍历顺序表，找到与list[i]（即getElem(i))对应的数据所在的位置
            //将其修改为用户想修改的ElemType数据对象
            if (list[j].equals(getElem(i))) {
                list[j]=reUp;//修改对象
            }
        }
       
    }
 
    //遍历查询
    public void show() {
        for (int i = 0; i < curLength; i++) {
            System.out.println(list[i]);
        }
    }
 
}
 public class TsetDemo {
 public static void main(String[] args) throws Exception 
 {
    int n = new Scanner(System.in).nextInt();
    SqList L = new SqList(n);
    for(int i = 0;i < n; i++ )
     {
        L.insert(i,new Scanner(System.in).nextInt());     
     }
     int Setin = new Scanner(System.in).nextInt();
     L.insert(Setin,new Scanner(System.in).nextInt()); 
     L.show();
     int Shan = new Scanner(System.in).nextInt();
     L.delete(Shan);
     L.show();
     int Cha =  new Scanner(System.in).nextInt();
     L.getElem(Cha);


     
 }
    
}
