package lab2;

public class ex1 {
    public static void main(String[] args) {

        //integer
        int a;
        a=10;
        System.out.println(a);
        int b = 20;
        System.out.println(b);
        int c = a + b;
        System.out.println("ผลรวมของ a และ b เท่ากับ\t"+c);

        //real number
        double g = 5.5;
        System.out.println(g);
        //g = g * 10;
        g *= 10; // g = g*10;
        System.out.println(g);

        //character
        char d = '#';
        System.out.println(d);

        //String
        String str = "Puriwat Lertkrai";
        System.out.println("My name is "+str);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());




    }//main


}//clss
