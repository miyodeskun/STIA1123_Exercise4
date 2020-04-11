
package exercise4;
import java.util.Scanner;
/**
 *
 * @author Amirul Luqman
 */
public class TestMyFCStaff {
    public static void main(String[]args){
        String name, staffID;
        double t_hoursWork, t_sales;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input your name: ");
        name = sc.nextLine();
        System.out.print("Input your Staff ID: ");
        staffID = sc.nextLine();
        System.out.print("Input your working hours: ");
        t_hoursWork = sc.nextDouble();
        System.out.print("Input your total sales: ");
        t_sales = sc.nextDouble();
        System.out.println("");
        
        MyFCStaff x = new MyFCStaff (name, staffID, t_hoursWork, t_sales);
        x.displaySalary();
    }
}
    
    class MyFCStaff {
    private String name, staffID;
    private double t_hoursWork, t_sales, t_salary, commission;
    
    public MyFCStaff(String name, String staffID, double t_hoursWork, 
           double t_sales){
        this.name = name;
        this.staffID = staffID;
        this.t_hoursWork = t_hoursWork;
        this.t_sales = t_sales;
    }
    
    public double calculateCommission(){
        if (t_sales >= 150 && t_sales <= 300){
            commission = t_sales * 0.05;
        }
        else if (t_sales >= 301 && t_sales <= 500){
            commission = t_sales * 0.1;
        }
        else if (t_sales > 500){
            commission = 0.15;
        }
        else{
            commission = 0;
        }
        return commission;
    }
    
    public double calculateSalary(){
        t_salary = t_hoursWork*8 + calculateCommission();
        return t_salary;
    }
    
    void displaySalary(){
        String x = "%-15s%-2s%s\n";
        String y = "%-15s%-5s%.2f\n";
        
        System.out.printf(x, "Staff Name",":", name);
        System.out.printf(x, "StaffID", ":", staffID);
        System.out.printf("%-15s%-2s%.0f\n", "Hours Work", ":", t_hoursWork);
        System.out.printf(y,"Total Sale", ": RM " , t_sales);
        System.out.printf(y,"Total Salary", ": RM " , calculateSalary());
        
    }
}

