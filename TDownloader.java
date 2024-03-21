public class TDownloader implements Runnable{
        private String url;
        private String name;
        
        public TDownloader(String url, String name) {
        super();
        this.url = url;
        this.name = name;
        }
        public void run() {
        WebDownload wd=new WebDownload();
        wd.download(url, name);
        System.out.println(name);
        }
        public static void main(String[] args) {
        // TODO Auto-generated method stub
        TDownloader td1=new TDownloader("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fblog%2F202106%2F09%2F20210609081952_51ef5.thumb.1000_0.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1681456112&t=f9cae39e22d8ff7d549a18aa7d193ae4","1.jpg");
        TDownloader td2=new TDownloader("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fblog%2F202106%2F22%2F20210622154903_3c36a.thumb.1000_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1681456112&t=c7fac86b22baf3120a158e863d8b6749","2.jpg");
        TDownloader td3=new TDownloader("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fblog%2F202106%2F22%2F20210622140718_0b391.thumb.1000_0.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1681456112&t=dc99d66460d451e229c56d94375bcb9e","3.jpg");
        
        new Thread(td1).start();
        new Thread(td2).start();
        new Thread(td3).start();
        
        }
        }

        