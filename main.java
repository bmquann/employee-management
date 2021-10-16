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
        Scanner scanner = new Scanner(System.in);

        PartTime part = new PartTime();
        Fulltime full = new Fulltime();
        Management manager=new Management();
        while (true) {
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
                    System.out.println("Enter a: to insert PartTime");
                    System.out.println("Enter b: to insert FullTime");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            part.input(); 
                            part.caculateSalary();
                            manager.add(part);
                            System.out.println(part.toString());
                            break;

                        }
                        case "b": {
                            full.input();
                            full.caculateSalary();
                            manager.add(full);
                            System.out.println(full.toString());
                            break;
                        }                                              
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    manager.search(name).forEach(employee -> {
                        System.out.println(employee.toString());
                    });
                    break;
                }
                case "3": {
                    manager.Display();
                    break;
                }
                case "4": {
                    System.out.print("Enter id to delete: ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id) ? "Success" : "Fail");
                    break;
                }
                case "5":{
                    System.out.print("Enter id to delete: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter a: to insert PartTime");
                    System.out.println("Enter b: to insert FullTime");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            part.input(); 
                            part.caculateSalary();
                            manager.edit(id,part);
                            break;

                        }
                        case "b": {
                            full.input();
                            full.caculateSalary();
                            manager.edit(id,full);
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
