package Sort_n_Search;

import java.util.Scanner;

class linearSearch {
    public static void main(String[] args) {
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter " + n + "integers");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (c = 0; c < n; c++) {

        }
    }
}
