package semester_1;

import java.util.Scanner;
import java.util.Stack;

public class stackLL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> data = new Stack<>();
        boolean run = true;

        while (run) {
            System.out.println("======================================================");
            System.out.print(
                    "1. push\n" +
                            "2. pop\n" +
                            "3. peek\n" +
                            "4. print\n" +
                            "5. close program\n" +
                            "choose: ");
            int choosenCase = input.nextInt();

            switch (choosenCase) {
                case 1:
                    System.out.print("jumlah data yang akan dimasukkan kedalam stack: ");
                    int jumlahData = input.nextInt();
                    System.out.println("======================================================");
                    System.out.println("!!! STRING ONLY!!!");

                    for (int i = 1; i <= jumlahData; i++) {
                        System.out.print("input data ke-" + i + " : ");
                        data.push(input.next());
                    }
                    break;
                case 2:
                    System.out.println("u will remove the top of stack ");
                    System.out.println("======================================================");
                    String remove = data.pop();
                    System.out.println(remove + " removed");
                    break;
                case 3:
                    System.out.println("see the top of stack");
                    System.out.println("======================================================");
                    String seeTop = data.peek();
                    System.out.println("top element: " + seeTop);
                    break;
                case 4:
                    System.out.println("printing stack");
                    System.out.println("======================================================");
                    System.out.println("Data: " + data);
                    break;
                case 5:
                    System.out.println("exiting program ..");
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
