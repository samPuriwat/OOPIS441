/*
 * Copyright (c) 2562. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package lab10;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class empDAOImpl implements empDAO {
    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:D:/company.sqlite";
    private static Connection conn = null;

    //Constants Operation
    private static final String GET_ALL_EMP =
            "select * from employee";
    private static final String ADD_EMP =
            "insert into employee (id,name,position,salary) values (?,?,?,?)";
    private static final String FIND_BY_ID =
            "select * from employee where id = ?";
    private static final String UPDATE_EMP =
            "update employee set name=?,position=?,salary=? " +
                    "where id=?";
    private static final String DELETE_EMP =
            "delete from employee where id=?";


    private static empDAOImpl instant = new empDAOImpl();

    //constructor
    private empDAOImpl() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Load Driver Successfully.");
    }

    public static empDAOImpl getInstant() {
        return instant;
    }

    @Override
    public List<Employee> getAllEmp() {

        List<Employee> emp = new ArrayList<>();

        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_EMP);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);

                emp.add(new Employee(id, name, position, salary));
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    @Override
    public void addEmp(Employee emp) {

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(ADD_EMP);
            //set properties
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getPosition());
            ps.setDouble(4, emp.getSalary());
            ps.execute();
            System.out.println("Employee with name " + emp.getName() +
                    " was add to database already.");
            ps.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Duplicated Employee with id= " + emp.getId());
            e.printStackTrace();
        }

    }

    @Override
    public Employee getEmpById(int id) {
        Employee emp = null;

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(FIND_BY_ID);
            //set parameter
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idd = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);

                emp = new Employee(idd, name, position, salary);
            } else {
                System.out.println("Not found employee with id=" + id);
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;

    }

    @Override
    public void updateEmp(Employee emp) {

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(UPDATE_EMP);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getPosition());
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getId());

            int result = ps.executeUpdate();
            if (result != 0) {
                System.out.println("" +
                        "Employee with id=" + emp.getId() + "was updated.");
            } else {
                System.out.println("" +
                        "Could not update employee data with id=" + emp.getId());
            }
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteEmp(int id) {

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(DELETE_EMP);
            ps.setInt(1, id);

            int result = ps.executeUpdate();
            if (result != 0) {
                System.out.println("" +
                        "Employee with id=" + id + "was deleted.");
            } else {
                System.out.println("" +
                        "Could not deleted employee with id=" + id);
            }
            ps.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
