package UNIT03;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            ll1.add(sc.nextInt());
        }
        Iterator itr = ll1.descendingIterator();
        while(itr.hasNext())
            System.out.println(itr.next());

        Collections.sort(ll1);
        System.out.println(ll1);
        System.out.println("First Element: "+ll1.get(0)); // ll1.gerFirst()
        System.out.println(ll1.getLast());
    }
}
