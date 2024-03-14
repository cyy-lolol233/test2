import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest03 {
    public static void main(String[] args) {
        String path = "d:\\";
        File root = new File(path);
        try (FileWriter writer = new FileWriter("filename.txt")) {
            traverse(root, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void traverse(File file, FileWriter writer) throws IOException {
        if (file.isDirectory()) {
            System.out.println(file.getName() + " 是一个文件夹");
            writer.write(file.getName() + "\n");
            for (File subFile : file.listFiles()) {
                traverse(subFile, writer);
            }
        } else {
            System.out.println(file.getName() + " 是一个文件");
        }
    }
}
