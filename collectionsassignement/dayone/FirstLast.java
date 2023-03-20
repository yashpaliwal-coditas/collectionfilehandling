package collectionsassignement.dayone;

import java.util.HashSet;
import java.util.Iterator;

public class FirstLast {
    HashSet<Integer> list = new HashSet<>();
    FirstLast(){
        for(int i=1;i<10;i++){
            list.add(i);
        }
    }
    void fetch(){
        Iterator<Integer> it = list.iterator();
        System.out.println("first element is "+it.next());
        Integer last=0;
        while(it.hasNext()){

            last=it.next();
        }
        System.out.println("last element is "+last);
    }
    public static void main(String[] args) {
        FirstLast firstLast = new FirstLast();
        firstLast.fetch();
    }
}
