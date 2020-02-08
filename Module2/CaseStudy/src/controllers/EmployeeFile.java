package controllers;

import models.Customer;
import models.Employee;

import java.util.Queue;
import java.util.Stack;

    public class EmployeeFile {
        Stack<Employee> stack = new Stack<>();

        public void addCustomer(Employee employee) {
            stack.push(employee);
        }

        public void findEmpolee(String id) {
            int check = 0;
            for (int i = 0; i < stack.capacity(); i++) {
                if (stack.elements().nextElement().getId().compareTo(id) == 0) {
                    System.out.println("Found");
                    System.out.println(stack.elements().nextElement().toString());
                    check =1;
                    break;
                }
            }
            if(check==0){
                System.out.println("Does not exist");
            }
        }

        public static void main(String[] args) {
            Employee em1 = new Employee("100", "Tuyet", 22, "Da Nang");
            Employee em2 = new Employee("101", "Lan", 24, "Quang Nam");
            Employee em3 = new Employee("102", "Hong", 21, "Da Nang");
            Employee em4 = new Employee("103", "Diep", 20, "Quang Nam");
            Employee em5 = new Employee("104", "Trinh", 19, "Da Nang");
            Employee em6 = new Employee("105", "Ngoc", 20, "Quang Nam");
            Employee em7 = new Employee("106", "Thanh", 22, "Da Nang");
            Employee em8 = new Employee("107", "Nam", 24, "Quang Nam");
            Employee em9 = new Employee("108", "Bac", 25, "Da Nang");
            Employee em10 = new Employee("109", "Son", 26, "Da Nang");
            EmployeeFile employeeFile = new EmployeeFile();
            employeeFile.addCustomer(em1);
            employeeFile.addCustomer(em2);
            employeeFile.addCustomer(em3);
            employeeFile.addCustomer(em4);
            employeeFile.addCustomer(em5);
            employeeFile.addCustomer(em6);
            employeeFile.addCustomer(em7);
            employeeFile.addCustomer(em8);
            employeeFile.addCustomer(em9);

            employeeFile.findEmpolee("300");



        }
    }