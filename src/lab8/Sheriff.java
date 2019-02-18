/*
 * Copyright (c) 2562. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package lab8;

public class Sheriff extends Person {
    private String workState;

    //constructor

    public Sheriff(String pID, String name,
                   String yearBorn, String workState) {
        super(pID, name, yearBorn);
        this.workState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am sheriff work at " + this.workState);
    }

    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }
}
