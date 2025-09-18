package javabasic;
class Student extends Object{
    private Integer rollNumber;
    private String name;
    public Student(){
        rollNumber =null;
        name = null;
    }
    public Student(Integer rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student rollname = "+this.rollNumber+" name = "+ this.name;
    }
}

public class OverridingDemo {
    public static void main(String...a){
        Student student=new Student(1,"Vinay");
        System.out.println(student);
        System.out.println(student.getName());
        student = new Student();
        System.out.println(student.getName());
        System.out.println(student);
    }
}
