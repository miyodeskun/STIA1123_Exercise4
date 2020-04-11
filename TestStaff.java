package exercise4;
/*
***Author: Amirul Luqman
*/
import java.util.Scanner;

class TestStaff {
    static Scanner console = new Scanner(System.in);	
    public static void main(String arg[]){
        
        String name, staffID;
        double salary;
        int workingDay;
        
        System.out.print("Input your name: ");
        name = console.nextLine();
        System.out.print("Input your Staff ID: ");
        staffID = console.nextLine();
        System.out.print("Input your working days: ");
        workingDay = console.nextInt();
        System.out.println("");
        
        Staff x = new Staff();
        x.setStaffInfo(name, staffID, workingDay);
        x.calculateSalary();
        System.out.println("===== STAFF INFO =====");
        System.out.println("Staff name: " + x.getName());
        System.out.println("Staff ID  :" + x.getStaffID());
        System.out.printf("Salary    : RM %.2f\n" , x.getSalary());
    }        
}
    class Staff {
	private String name, staffID;
	private double salary;
	private int workingDay;
	public void setStaffInfo(String nm, String id, int wDay){
		name=nm;
                staffID=id;
                workingDay=wDay;
	}
	public void calculateSalary(){
		salary = workingDay * 35.0;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
	public String getStaffID(){
		return staffID;
	}
}//end class

