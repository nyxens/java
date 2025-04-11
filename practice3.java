import java.io.*;
public class practice3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        fos.write("Hello world\n".getBytes()); fos.close();
    }
}
