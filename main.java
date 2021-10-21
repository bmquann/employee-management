/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author manhq
 */
public class main {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        PartTime part = new PartTime();
        Fulltime full = new Fulltime();
        Management manager = new Management();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("================================");
            System.out.println("Application Manager Employee");
            System.out.println("Enter 1: To insert employee");
            System.out.println("Enter 2: To search employee by name: ");
            System.out.println("Enter 3: To show information employee");
            System.out.println("Enter 4: To delete employee");
            System.out.println("Enter 5: To edit information employee");
            System.out.println("Enter 6: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    manager.add(empList);
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    manager.search(name, empList).forEach(employee -> {
                        System.out.println(employee.toString());
                    });
                    break;
                }
                case "3": {
                    manager.Display(empList);
                    break;
                }
                case "4": {
                    System.out.print("Enter id to delete: ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id, empList) ? "Success" : "Fail");
                    break;
                }
                case "5": {
                    System.out.print("Enter id to edit: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter a: to insert PartTime");
                    System.out.println("Enter b: to insert FullTime");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            part.input();
                            part.caculateSalary();
                            manager.edit(id, part, empList);
                            break;

                        }
                        case "b": {
                            full.input();
                            full.caculateSalary();
                            manager.edit(id, full, empList);
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }

                    break;
                }
                case "6": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }

    }
}
