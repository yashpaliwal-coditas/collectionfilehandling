package filehandling;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("yash.txt");
        FileInputStream fileInputStream1 = new FileInputStream("yash1.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream1 ,fileInputStream);
        int x;
        while ((x=sequenceInputStream.read())!=-1){
            System.out.println((char)x);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(67);

        byteArrayOutputStream.writeTo(new FileOutputStream("yash.txt"));
        byteArrayOutputStream.writeTo(new FileOutputStream("yash1.txt"));
    }
}
