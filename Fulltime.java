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
public class Fulltime extends Employee{
    private int dayWork;

    public Fulltime() {
    }

    public Fulltime(int dayWork) {
        this.dayWork = dayWork;
    }

    public void setDayWork(int dayWork) {
        this.dayWork = dayWork;
    }
    
    public int getDayWork() {
        return dayWork;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Nhập lương cơ bản : ");
        basicsalary = scanner.nextInt();
        System.out.print("Nhập số ngày làm: ");
        dayWork=scanner.nextInt();
    }
    
    @Override
    public int caculateSalary() {
        salary=(this.basicsalary*this.dayWork)/28;
        return salary;

    }

    @Override
    public String toString() {
        return super.toString()+ "\n, Số giờ làm: "+this.dayWork+", Tiền lương: "+this.salary; //To change body of generated methods, choose Tools | Templates.
    }
    
}
