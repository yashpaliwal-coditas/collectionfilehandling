package collectionsassignement.dayone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class ConvertTreeToSet {
    void convert(){
        TreeSet<Integer> tree =new TreeSet<>();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        HashSet<Integer> hash = new HashSet<>(tree);
        System.out.println(hash);
    }
    public static void main(String[] args) {
        ConvertTreeToSet convertTreeToSet = new ConvertTreeToSet();
        convertTreeToSet.convert();

    }
}
