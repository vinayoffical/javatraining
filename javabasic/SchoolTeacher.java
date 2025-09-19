package javabasic;

public class SchoolTeacher implements DanceTeacher,Teacher{
    @Override
    public void knowledge() {
        DanceTeacher.super.knowledge();
    }
}
