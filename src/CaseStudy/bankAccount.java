/*
 * Copyright (c) 2562. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package CaseStudy;

public class bankAccount {
    private String id;
    private double balance;
    private Customer cus;

    public bankAccount(String id, double balance, Customer cus) {
        this.id = id;
        this.balance = balance;
        this.cus = cus;
    }

    public String getId() {
        return this.id;
    }

    public double checkBalance() {
        return this.balance;
    }

    public void doposit(double amount) {
        this.balance += amount; // this.balance = this.balance+amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getInfo() {
        return "[Customer Name: " + this.cus.getName() + " " +
                "Bank ID: " + this.id + " " +
                "Balance: " + this.balance + "]";
    }

}//class
