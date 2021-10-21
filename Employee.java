/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author manhq
 */
import java.util.Scanner;

public class Employee {

    private String id, name, phone, mail, department;
    private int age;
    protected int salary, basicsalary;

    public Employee() {
    }

    public Employee(String id, String name, String phone, String mail, int age, int salary, int basicsalary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.age = age;
        this.salary = salary;
        this.basicsalary = basicsalary;
        this.department = department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBasicsalary(int basicsalary) {
        this.basicsalary = basicsalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int getBasicsalary() {
        return basicsalary;
    }

    public String getDepartment() {
        return department;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên nhân viên: ");
        name = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        phone = scanner.nextLine();
        System.out.print("Nhập mail: ");
        mail = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        System.out.print("Nhập phòng ban: ");
        department = scanner.nextLine();
        scanner.nextLine();
    }

    public int caculateSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + this.id + ", họ tên nhân viên: " + this.name
                + ", số điện thoại: " + this.phone + ", mail: " + this.mail
                + ", tuổi: " + this.age + ", lương cơ bản: " + this.basicsalary;
    }
}
