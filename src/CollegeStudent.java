public class CollegeStudent extends Student {

    CollegeStudent(int roll_no, String name) {
        super(roll_no, name);
    }

    @Override
    public void attend_class() {
        System.out.println(name + " is attending class online via Zoom");
    }

    @Override
    public void give_exam() {
        System.out.println(name + " is giving exam on computer");
    }
}