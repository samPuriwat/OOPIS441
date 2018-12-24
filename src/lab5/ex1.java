package lab5;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        int num[] = new int[5];
//        showData(num);
//        num[3] = 5;
//        showData(num);
//        num[0] = num[3] * 5;
//        showData(num);
        //calling input
        int myNum[] = inputData(num);
        //show data in array
        showData(myNum);  //showData(inputData(num));




    }//main

    private static int[] inputData(int[] num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter integers: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("num[" + i + "]:");
            num[i] = scanner.nextInt();
        }
        return num;
    }//inputData

    private static void showData(int[] num) {
        System.out.println("Data in Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+"\t");
        }
        System.out.println("\n");

    }//showData
}//ex1
