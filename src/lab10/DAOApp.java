/*
 * Copyright (c) 2562. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package lab10;

import java.util.List;

public class DAOApp {

    public static void main(String[] args) {

        empDAOImpl dao = empDAOImpl.getInstant();
        //GET_ALL_EMP
        showAllData(dao);
        //ADD_EMP
        Employee newEmp = new Employee(
                102,
                "Jinraporn Thomkeaw",
                "System Analysis",
                3000);
//       dao.addEmp(newEmp);
//        showAllData(dao);

        //FIND_BY_ID
        Employee e = dao.getEmpById(100);
        System.out.println(e.toString());

        //UPDATE_EMP
        e.setSalary(30000);
        dao.updateEmp(e);
        showAllData(dao);

        //DELETE_EMP
        dao.deleteEmp(100);
        showAllData(dao);
    }

    private static void showAllData(empDAOImpl dao) {
        List<Employee> allEmp = dao.getAllEmp();
        System.out.println("-----Data in Database-----");
        for (Employee emp : allEmp) {
            System.out.println(emp.toString());
        }
        System.out.println("--------------------------");
    }
}
