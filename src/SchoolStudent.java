public class SchoolStudent extends Student {
    SchoolStudent(int roll_no,String name) {
        super(roll_no, name);
    }
    public void attend_class(){
        System.out.println(name+" is attending class offline");
    }
    public void give_exam(){
        System.out.println(name+" giving exam in pen and paper");
    }


}