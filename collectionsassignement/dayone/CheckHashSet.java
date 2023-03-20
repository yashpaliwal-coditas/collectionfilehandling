package collectionsassignement.dayone;

import java.util.HashSet;

public class CheckHashSet {
    HashSet<Integer> list = new HashSet<>();
    CheckHashSet(){
        for(int i=1;i<10;i++){
            list.add(i);
        }
    }
    public void Check(){
        if(list.contains(4)){
            System.out.println("4 is in our hashset");
        }
        else
            System.out.println("4 is not in hashset");
    }
    public static void main(String[] args) {
        CheckHashSet checkHashSet = new CheckHashSet();
        checkHashSet.Check();
    }
}
