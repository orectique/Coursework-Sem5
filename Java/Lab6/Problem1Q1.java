/*Problem 1
Q1.
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class
Q2.
In the above example, declare the method of the parent class as private and then repeat the first two operations (You will get error in the third).
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.
*/


public class Problem1Q1 {
    public static class Parent {
        public void printParent() {
            System.out.println("This is parent class");
        }
    }

    public static class Child extends Parent {
        public void printChild() {
            System.out.println("This is child class");
        }
    }
    public static void main(String[] args) {
        Parent p = new Parent();
        p.printParent();
        Child c = new Child();
        c.printChild();
        c.printParent();
    }    
}
