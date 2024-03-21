class Receiver { // 接电话者
	public void call(String CallerName, String msg) {
		int tim;
		System.out.println("我在接" + CallerName + "打来的电话,他对我说:" + msg + ",我在和他交谈...");
		try {
			tim = (int) (Math.random() * 20 + 10); // 接电话的时间,取1秒～3秒之间的随机数
			Thread.sleep(tim);
		} catch (InterruptedException e) {
		}
		System.out.println("我接完" + CallerName + "的电话");
	}
}

class Caller implements Runnable  { // 打电话者线程
	String name;
	Receiver r;
	String msg;
	Thread thread;

	Caller(String name, Receiver r, String msg) throws Exception{
		this.name = name;
		this.r = r;
		this.msg = msg;
		this.thread = new Thread(this);
        this.thread.start();
		this.thread.join();
	    
	}

	public void run() {
		r.call(name, msg);
	}
}

public class callTest {
	public static void main(String args[]) throws Exception {
		Receiver r = new Receiver();
		Caller s1 = new Caller("1张三", r, "你好吗?");
		Caller s2 = new Caller("2李四", r, "祝愿你万事如意");
		Caller s3 = new Caller("3王二", r, "新年好");
		System.out.println("结束！");
	}
}

