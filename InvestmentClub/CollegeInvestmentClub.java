import java.util.ArrayList;
import java.lang.Math;

public class CollegeInvestmentClub {
    public static void main(String[] args) {
        // Employee Arraylist Initalization
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        // Employee Adding
        employees.add(new Employee("Peter", "Esposito", "10001", "peter.esposito@sunydutchess.edu", 502.81, "Student")); // 0
        employees.add(new Employee("Akram", "Gafur", "10010", "akram.gafur@sunydutchess.edu", 273, "Student")); // 1
        employees.add(new Employee("Caleb", "Herrera", "10011", "caleb.herrera@sunydutchess.edu", 278, "Student")); // 2
        employees.add(new Employee("John", "Maksuta", "10100", "john.maksuta@sunydutchess.edu", 329, "Student"));  // 3
        employees.add(new Employee("Herrera", "Marin", "10101", "herrera.marin@sunydutchess.edu", 445, "Student")); // 4
        employees.add(new Employee("Brandon", "Mohammed", "10110", "brandon.mohammed@sunydutchess.edu", 402, "Student")); // 5   
        employees.add(new Employee("Christopher", "Shenton", "10111", "christopher.shenton@sunydutchess.edu", 388, "Student")); // 6 
        employees.add(new Employee("Lucas", "Stoffel", "11000", "lucas.stoffel@sunydutchess.edu", 275, "Student")); // 7
        employees.add(new Employee("Appolo", "Tankeh", "11001", "appolo.tankeh@sunydutchess.edu", 278, "Faculty")); // 8

        // Showcase Original Data
        System.out.println("Original data:");
        getAllEmployeeData(employees);
        System.out.println();

        // Showcase Bank Deposit/Withdrawal
        employees.get(0).deposit(2000);
        System.out.println("Depositing $2000 into Peter New Balance: $" + employees.get(0).getBalance());
        System.out.println();

        // Give everyone money
        for (Employee emp : employees) { 
            emp.deposit(1000);
            System.out.println("Depositing $1000 to " + emp.getFirstName() + " New balance: $" + emp.getBalance());
        }
        System.out.println();

        // Withdraw random amount of money
        for (Employee emp : employees) {
            double randomNumber = Math.round(Math.random() * (200 - 100 + 1) + 100);
            emp.withdraw(randomNumber);
            System.out.println("Withdrawing $" + randomNumber + " from " + emp.getFirstName() + " New balance: $" + emp.getBalance());
        }
        System.out.println();

        // New data
        System.out.println("Edited data:");
        getAllEmployeeData(employees);
        System.out.println();
    }
    
    public static void getData(Employee e) {
        System.out.println(" FIRST NAME: " + e.getFirstName() +  "\n LAST NAME: " + e.getLastName() + "\n ID: " + e.getidNum() + "\n EMAIL: " + e.getEmail() + "\n BALANCE: $" + e.getBalance() + "\n EMPLOYEE TYPE: " + e.getEmployeeType() );
    }

    public static void getAllEmployeeData(ArrayList<Employee> array) {
        System.out.println("--------------");;
        for (Employee employee : array) {
            getData(employee);
            System.out.println("--------------");;
        }
    }
}
