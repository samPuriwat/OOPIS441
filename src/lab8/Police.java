/*
 * Copyright (c) 2562. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package lab8;

public class Police extends Person {
    private String workCountry;


    public Police(String pID, String name, String yearBorn, String workCountry) {
        super(pID, name, yearBorn);
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am police work at " + this.workCountry);
    }

    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }
}
