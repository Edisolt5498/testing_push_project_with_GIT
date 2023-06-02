import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputNumberOfLines = new Scanner(System.in);

        System.out.print("Input a number of lines of arrow: ");
        int n = inputNumberOfLines.nextInt;

        //int n = 12; //the size of arrow
        int last = n*2-1; // num of symbols at last line
        int scale = n/2; // for correct size for arrow

        char symbol = '+';
        char space = ' ';

        for (int i = 1; i <= n; i++)  //num of lines
        {

            for (int j = 0; j < n-i; j++)
            {
                System.out.print(space);

            }
            for (int k = 0; k < i; k++)
            {
                System.out.print(symbol);  //main '0'
            }
            for (int j = 1; j < i; j++)
            {
                System.out.print(symbol);  //add '0'
            }

            System.out.println("");
        }

        for (int i = 0; i < n-scale; i++)  //line under arrow (num of lines)
        {
            for (int j = 0; j < scale; j++)  //num of space
            {
                System.out.print(space);
            }
            for (int j = 0; j < last-scale*2; j++)  //num of symbols
            {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}