/*
 * Copyright (c) 2562. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CaseStudy;

public class BankApp {
    public static void main(String[] args) {
        //object customer
        Customer cus1 = new Customer();
        cus1.setName("Puriwat Lertkrai");

        //object bankAccount
        bankAccount acc = new bankAccount("11-110-110-110",
                500.00, cus1);

        System.out.println(acc.getInfo());
        acc.doposit(2000.00);
        System.out.println(acc.getInfo());
        acc.withdraw(1000.00);
        System.out.println(acc.getInfo());


    }//main
}//class
