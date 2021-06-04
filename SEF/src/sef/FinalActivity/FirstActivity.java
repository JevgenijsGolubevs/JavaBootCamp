//package sef.FinalActivity;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//
//public class FirstActivity extends Employee {
//    public static void main(String args[]) {
//
//        Employee e = new Employee();
//        e.setName("John Civic");
//        e.setAge(22);
//        e.setjobTitle("HONDA MOTOR SPORTS worker");
//        e.setSalary(70000);
//
//        Employee e1 = new Employee();
//        e1.setName("Julie Opel");
//        e1.setAge(40);
//        e1.setjobTitle("Gardenkeeper");
//        e1.setSalary(3000);
//
//        Employee e2 = new Employee();
//        e2.setName("Adolf Panamera");
//        e2.setAge(32);
//        e2.setjobTitle("Steward");
//        e2.setSalary(10000);
//
//        Employee e3 = new Employee();
//        e3.setName("Conor Stateway");
//        e3.setAge(50);
//        e3.setjobTitle("Businessman");
//        e3.setSalary(200000);
//
//        System.out.println("My name is " + e.getName() + " " + "I am " + " " + e.getAge() + " " + "years old! My profession is " + " " + e.getjobTitle() + " " + "and my earnings is a" + " " + e.getSalary() + " " + "$ per year!");
//
//
//        ArrayList<Integer> salary = new ArrayList<Integer>();
//
//        salary.add(e.getSalary());
//        salary.add(e1.getSalary());
//        salary.add(e2.getSalary());
//        salary.add(e3.getSalary());
//
//        Collections.sort(salary);
//        Collections.reverse(salary);
//        System.out.println(salary);
//    }
//}
package sef.FinalActivity;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FirstActivity {

    public static void main(String[] args) {

        List<Employee> employees;

        employees = Arrays.asList(
                new Employee("John", "Gardener", "Yandex", 500, 45),
                new Employee("Peter", "Engineer", "LSC", 10000, 32),
                new Employee("Ivan", "Cadet", "Lapa", 200, 19),
                new Employee("Julie", "Steward", "Liddle", 1500, 23),
                new Employee("Logan", "Driver", "Bolt", 800, 50));
        new FirstActivity().foo(employees);
    }

    public void foo(List<Employee> employees) {
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }
}
