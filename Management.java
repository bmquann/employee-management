/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author manhq
 */
public class Management {
     private List<Employee> empList;

    public Management() {
        this.empList = new ArrayList<>();
    }
    public void add(Employee emp) {
        this.empList.add(emp);
    }

    public List<Employee> search(String name) {
        return this.empList.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public boolean delete(String id) {
        Employee empDel = this.empList.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (empDel == null) {
            return false;
        }
        this.empList.remove(empDel);
        return true;
    }
    public void edit(String id, Employee emp) {
        search(id).forEach(employee -> {
            empList.set((empList.indexOf(employee)),emp);
        });
    }


    public void Display() {
        this.empList.forEach(o -> System.out.println(o.toString()));
    }

}
