package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesirializationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
            Student s = (Student) objectInputStream.readObject();
            System.out.println(s);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());;
        }
    }
}
//after coping:
//Student; local class incompatible: stream classdesc serialVersionUID = -2680310727817582875, local class serialVersionUID = -8847663034456242673