import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
        LinkedList linkList = new LinkedList();
        Scanner stdin = new Scanner(System.in);
        int arryListTotal = 0;


        for (int i=0; i < 10; i++) {
                System.out.print("Integer " + (i + 1) + " for Arraylist (or type -1 to exit): ");
                int num = stdin.nextInt();
                if(num == -1) {
                    break;
                }
                arrList.add(num);
                arryListTotal += num;
        }

        System.out.println("\n");

        for (int i=0; i < 10; i++) {
            System.out.print("Integer " + (i + 1) + " for LinkedList (or type -1 to exit): ");
            int num = stdin.nextInt();
            if(num == -1) {
                break;
            }
            linkList.add(num);
        }

        System.out.println("\n");
        System.out.println("Arraylist Values: " + arrList);
        System.out.println("ArrayList total: " + arryListTotal);

        System.out.println("\n");
        System.out.println("Linkedlist Values: " + linkList);
        System.out.println("Linked List total: " + linkList.sum());
    }
}
