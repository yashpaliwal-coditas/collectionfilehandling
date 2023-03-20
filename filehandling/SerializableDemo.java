package filehandling;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SerializableDemo {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("yash.txt");
            FileInputStream fileInputStream1 = new FileInputStream("yash1.txt");
            Vector v = new Vector();
            v.add(fileInputStream);
            v.add(fileInputStream1);
            Enumeration e = v.elements();
            SequenceInputStream sequenceInputStream = new SequenceInputStream(e);
            int j;
            while((j=sequenceInputStream.read())!=-1){
                System.out.println((char) j);
            }
            FileOutputStream fileOutputStream = new FileOutputStream("yash.txt");
            FileOutputStream fileOutputStream1 = new FileOutputStream("yash1.txt");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(65);
            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.writeTo(fileOutputStream1);
            while((j=fileInputStream.read())!=-1){
                System.out.println((char) j);
            }
            while((j=fileInputStream1.read())!=-1){
                System.out.println((char) j);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            Student student = new Student(12,"yash Paliwal","agra");
            objectOutputStream.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
//�� sr filehandling.Student�6�X�� L addresst Ljava/lang/String;L nameq ~ xpt agrat yash