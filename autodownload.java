import java.io.*;
import java.net.*;
import org.apache.commons.io.FileUtils;

public class autodownload {
	public void download(String url, String name) {
		try {
			FileUtils.copyURLToFile(new URL(url), new File(name));
		} catch (MalformedURLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("不合法的url");
		} catch (IOException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("下载失败");
		}

	}

	public static void main(String[] args) {
		WebDownload w = new WebDownload();
		w.download("https://t7.baidu.com/it/u=1819248061,230866778&fm=193&f=GIF", "1.jpg");
	}
}
