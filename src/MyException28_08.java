public class MyException28_08 {
    public static void main(String[] args){
        UserDefineException28_08 usf = new UserDefineException28_08();
        try{
            usf.validate(45);
            usf.validate(12);

        }
        catch(InvalidAgeException28_08 e){
            System.out.println(e.getMessage());
        }
    }
}
