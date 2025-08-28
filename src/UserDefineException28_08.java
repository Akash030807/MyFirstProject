// step 2 cont.
public class UserDefineException28_08 {
    public void validate(int age)throws InvalidAgeException28_08 {
        if(age<18){
            throw new InvalidAgeException28_08("Not Eligible to Vote age less than 18");}
            else{
            System.out.println("Eligible to vote");
        }
    }
}
