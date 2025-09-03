package UNIT01;

public abstract class Student
{
    int roll_no;
    public String name;
    Student(int roll_no,String name){
        this.roll_no=roll_no;
        this.name=name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){
        System.out.println("Name is "+name+"is registered Successfully with Roll no="+roll_no);
    }

}