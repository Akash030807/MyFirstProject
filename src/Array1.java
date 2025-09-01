import  java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner as = new Scanner (System.in);
        for(int i =0;i<5;i++){
            a[i] = as.nextInt();
        }
        for(int i =0;i<5;i++){
            System.out.println("Element at "+i+" = "+a[i]);
        }
    }
}
