package collectionsassignement.dayone;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class ConvertHastToTree {
    void convertTree(){
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);
    }
    public static void main(String[] args) {
        ConvertHastToTree convertHastToTree = new ConvertHastToTree();
        convertHastToTree.convertTree();
            }
}
