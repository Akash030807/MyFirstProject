package UNIT03;

import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];

        int c[][] = new int[2][3];
        Scanner as = new Scanner(System.in);
        for(int i =0;i<a.length;i++){
            for(int j =0;j<a[i].length;j++){
                a[i][j] = as.nextInt();
            }
        }
        System.out.println("b");
        for(int i =0;i<b.length;i++){
            for(int j =0;j<b[i].length;j++){
                b[i][j] = as.nextInt();
            }
        }
        for(int i =0;i<c.length;i++){
            for(int j =0;j<c[i].length;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
