public class CollegeStudent1 extends Student1{
    public int roll_no;
    public CollegeStudent1(String address, int roll_no){
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll(){
        System.out.println("Roll is : "+roll_no);
    }
}
