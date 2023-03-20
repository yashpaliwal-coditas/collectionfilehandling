package collectionsassignement.dayone;

import java.util.Iterator;
import java.util.LinkedList;
interface Demo{
    void display();
}
interface Demo1{
    void display();
}
class Demo2 implements Demo,Demo1{

    @Override
    public void display() {

    }
}
public class LinkedListDemo {
    void run(double a, double b){
        System.out.println("double");
    }

    void run(float a ,float b){
        System.out.println("float");
    }

    public static void main(String[] args) {
        Demo2 demo = new Demo2();
        demo.display();
        LinkedListDemo li = new LinkedListDemo();
        li.run(10,10);
        LinkedList l = new LinkedList();
        l.add("yash");
        l.add("paliwal");
        l.add("is");
        l.add("from");
        l.add("agra");
        l.add("UP");
        Iterator e = l.descendingIterator();
        while (e.hasNext()){
            System.out.println(e.next());
        }
    }
}
