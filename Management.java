/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author manhq
 */
public class Management implements IServices, IAction {

    private List<Employee> empList;

    public Management() {
        this.empList = new ArrayList<>();
    }

    @Override
    public void add(List<Employee> empList) {
        String id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: to insert PartTime");
        System.out.println("Enter b: to insert FullTime");
        String type = scanner.nextLine();
        switch (type) {
            case "a":
                PartTime part = new PartTime();
                System.out.print("Nhập mã nhân viên: ");
                id = scanner.nextLine();
                part.setId(id);
                part.input();
                part.caculateSalary();
                empList.add(part);
                System.out.println(part.toString());
                break;

            case "b": {
                Fulltime full = new Fulltime();
                System.out.print("Nhập mã nhân viên: ");
                id = scanner.nextLine();
                full.setId(id);
                full.input();
                full.caculateSalary();
                empList.add(full);
                System.out.println(full.toString());
                break;
            }
            default:
                System.out.println("Invalid");
                break;
        }

    }

    @Override
    public boolean delete(String id, List<Employee> empList) {
        Employee empDel = empList.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (empDel == null) {
            return false;
        }
        empList.remove(empDel);
        return true;
    }

    @Override
    public void edit(String id, Employee emp, List<Employee> empList) {
        for (int i = 0; i < empList.size(); i++) {

            if (empList.get(i).getId().equals(id)) {
                empList.set((i), emp);
                empList.get(i).setId(id);
            }
        }
    }

    @Override
    public void search(String name, List<Employee> empList) {
        for (Employee employee : empList) {
            if(employee.getName().equals(name)){
                System.out.println(employee.toString());
                
            }          
        }
    }

    @Override
    public void Display(List<Employee> empList) {
        for (Employee employee : empList) {
            System.out.println(employee.toString());
        }
    }

}
