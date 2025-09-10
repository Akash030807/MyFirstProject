package UNIT03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            products.add(sc.next());
        }
        Iterator itr = products.iterator();
        while(itr.hasNext()) {//tell next index me element hai ya nhi
            System.out.println(itr.next());// itr.next() → returns the current element and then moves the pointer to the next one.
        }
        products.add(3,"papaya");
        products.addLast("Lichi");
        Collections.sort(products);
        System.out.println(products);
        System.out.println(products.getLast());
        System.out.println(products.getFirst());
        System.out.println(products.get(2));
        //Iterator
//        hasNext() → checks if more elements are left.
//
//        next() → fetches current element and moves forward.
//
//        remove() → deletes the last element returned by next() safely.
    }
}
