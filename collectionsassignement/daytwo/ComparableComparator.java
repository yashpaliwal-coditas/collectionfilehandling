package collectionsassignement.daytwo;

import java.util.*;

class Employee implements Comparable<Employee>{
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if(salary==o.salary){
            return 0;
        }
        else if(salary>o.salary){
            return 1;
        }
        return -1;
    }
}
public class ComparableComparator {
    List<Employee> list = new ArrayList<>();

    void comparatorSort(){
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.id-o1.id;
            }
        });
        for (Employee employee:list)
            System.out.println(employee);
        Collections.sort(list);
        for (Employee employee:list)
        System.out.println(employee);
    }
    void enterData(){
        System.out.println("Enter id");
        Scanner scanner= new Scanner(System.in);
        int id=scanner.nextInt();
        System.out.println("Enter name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();
        list.add(new Employee(id,name,salary));
    }
    void case1(){
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.salary-o2.salary);
            }
        });
        for(Employee employee:list){
            if(employee.salary>15000){
                System.out.println(employee);
            }
        }
    }
    public static void main(String[] args) {
        boolean flag=true;
        Scanner scanner= new Scanner(System.in);
//        ComparableComparator comparableComparator = new ComparableComparator();
//        comparableComparator.enterData();
//        comparableComparator.enterData();
//        comparableComparator.enterData();
//        comparableComparator.enterData();
//        comparableComparator.comparatorSort();
       HashMap<String,Integer> map = new HashMap<>();
        for(Map.Entry<String,Integer> abc :map.entrySet()){
            abc.getValue();
        }
        System.out.println(map.putIfAbsent("yash",5));
        System.out.println(map.putIfAbsent("yash",7));
        System.out.println(map.putIfAbsent("paliwal",5));
        System.out.println(map.putIfAbsent("agra",7));
        System.out.println(map.keySet());
    }
}
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//1
//Enter id
//1
//Enter name
//yash
//Enter salary
//436533
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//1
//Enter id
//2
//Enter name
//aniket
//Enter salary
//11000
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//1
//Enter id
//3
//Enter name
//krati
//Enter salary
//15002
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//1
//Enter id
//4
//Enter name
//shreya
//Enter salary
//12000
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//2
//Employee{id=2, name='aniket', salary=11000.0}
//Employee{id=3, name='krati', salary=15002.0}
//Employee{id=4, name='shreya', salary=12000.0}
//Employee{id=1, name='yash', salary=436533.0}
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//3
//Employee{id=3, name='krati', salary=15002.0}
//Employee{id=1, name='yash', salary=436533.0}
//1.enter data
//2.Use sort by name
//3.Salary greater than 15000
//0.Exit
//0
//
//Process finished with exit code 0