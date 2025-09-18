package javabasic;

class Employee{
    static {
        System.out.println("Static Block of Employee");
    }
    {
        System.out.println("Instance Block");
    }
}

public class StaticBlock {
    static {
       System.out.println("Static Block");
    }
    public static void main(String...a){
        System.out.println("hello");
        Employee employee=new Employee();
        new Employee();
        new Employee();
        new Employee();
        new Employee();
    }
}
