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
public interface IAction {

    public List<Employee> search(String name, List<Employee> empList);

    public void Display(List<Employee> empList);
}
