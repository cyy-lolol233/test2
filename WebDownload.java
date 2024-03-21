import java.io.*;
import java.net.*;
import org.apache.commons.io.FileUtils;
public class WebDownload {

public  void download(String url,String name) {
try {
FileUtils.copyURLToFile(new URL(url),new File(name));
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
}
