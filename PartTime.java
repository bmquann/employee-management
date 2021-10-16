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
public class PartTime extends Employee{
    private int timeWork;

    public PartTime() {
    }

    public PartTime(int timeWork) {
        this.timeWork = timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    public int getTimeWork() {
        return timeWork;
    }

    @Override
    public void input() {
        super.input(); 
        System.out.print("Nhập lương cơ bản theo giờ: ");
        basicsalary = scanner.nextInt();
        System.out.print("Nhập số giờ làm:");
        timeWork=scanner.nextInt();
    }

    @Override
    public int caculateSalary() {
        this.salary=this.basicsalary*this.timeWork;
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n, Số giờ làm: "+this.timeWork+", Tiền lương: "+this.salary; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
