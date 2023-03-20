package collectionsassignement.daytwo;
import java.util.Enumeration;
import java.util.Vector;
public class VectorEnumaration {
    void display(){
        Vector vector = new Vector<>();
        vector.add("yash");
        vector.add(76);
        vector.add(456.5);
        vector.add("paliwal");
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
    public static void main(String[] args) {
        VectorEnumaration vectorEnumaration = new VectorEnumaration();
        vectorEnumaration.display();
    }
}
//yash
//76
//456.5
//paliwal
//
//Process finished with exit code 0