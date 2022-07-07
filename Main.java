package com.sjprogramming.empcompare;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> emps = new ArrayList<Employee>();

        Employee emp = new Employee();

        do {
            System.out.println("1.Add Employee\n2.Show Employees\n3. Exit");
            System.out.println("enter you choise");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Name");
                    String name = sc.next();
                    System.out.println("Enter Salary");
                    int sal = sc.nextInt();

                    try {
                        System.out.println("Enter Age");
                        int age = sc.nextInt();
                        if (age < 21)
                            throw new AgeException("Employee age should be at least more tha 21 years");
                        else {
                            Employee employee = new Employee(id, name, sal, age);
                            emps.add(employee);
                        }
                    } catch (AgeException ex) {
                        System.out.println(ex);
                    }

                    break;

                case 2:
                    System.out.println("Before Sorting : ");
                    for (Employee e : emps) {
                        System.out.println(e);
                    }
                    System.out.println("After Sorting Based on Salary :");
                    Collections.sort(emps, Employee.SalaryComparator);
                    for (Employee e : emps) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Thank you !");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice");

            }

        } while (true);


    }

}
