package EX2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AppEx2 {
    public static void main(String[] args) {
        List<Employee> employees =new ArrayList<>();
        employees.add(new Employee("Saaid","Finance",12000));
        employees.add(new Employee("Hamid","Sales",15000));
        employees.add(new Employee("Houda","IT",13000));
        employees.add(new Employee("Reda","Operation",10000));
        employees.add(new Employee("Hassan","CEO",25000));

        System.out.println("*****--Q1--*****");

        double sum = employees.stream().mapToDouble(Employee::getSalaire).sum();
        System.out.println("la somme totale des salaires de tous les employés: "+sum);

        System.out.println("*****--Q2--*****");

        List<Employee> sortedList =employees.stream()
                .sorted(Comparator.comparing(Employee::getSalaire))
                .collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("*****--Q3--*****");


        Optional<Employee> lowestSalary=employees.stream().min(Comparator.comparing(Employee::getSalaire));
        System.out.println(lowestSalary);

        System.out.println("*****--Q4--*****");

        employees.stream().filter(employee -> employee.getSalaire()>15000).forEach(System.out::println);

        System.out.println("*****--Q5--*****");

        


    }
}
