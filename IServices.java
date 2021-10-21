/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.List;

/**
 *
 * @author manhq
 */
public interface IServices {

    public void add(List<Employee> empList);

    public boolean delete(String id, List<Employee> empList);

    public void edit(String id, Employee emp, List<Employee> empList);
}
