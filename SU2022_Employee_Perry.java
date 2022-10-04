
/**
 *
 * 
 * 
 * Data Type Class - SU2022_Employee_Perry.java
 *
 * 
 * 
 */
import java.text.SimpleDateFormat; //  this was importted  to format date
import java.util.Date; // import date module

// create private strings and int
public class SU2022_Employee_Perry {
    private String employeeName;
    private String employeeID;
    private int salaryRange;
    private String positionID;

    public SU2022_Employee_Perry(String empName, String empID, int salaryRange, String positionID) {

        this.employeeName = empName;
        this.employeeID = empID;
        this.salaryRange = salaryRange;
        this.positionID = positionID;

    }

    public double getMonthlySalary() {
        double yearlySal = 0.00;
        switch (salaryRange) {
            case 1:
                yearlySal = 50000.00;
                break;
            case 2:
                yearlySal = 65306.00;
                break;
            case 3:
                yearlySal = 72848.00;
                break;
            case 4:
                yearlySal = 82000.00;
                break;
        }
        return yearlySal / 12;
    }

    // below is how to get the extra salary
    public double getExtraSalary() {
        switch (positionID) {
            case "OFF1":
                return 0 / 100.00 * getMonthlySalary();
            case "OFF2":
                return 5 / 100.00 * getMonthlySalary();
            case "OFF3":
                return 10 / 100.00 * getMonthlySalary();
            case "FF1":
                return 0.00;
            case "FF2":
                return 8 / 100.00 * getMonthlySalary();
        }
        return 0.00;
    }

    // below is how to calculate total salary
    public double getTotalSalary() {
        return getMonthlySalary() + getExtraSalary();
    }

    @Override
    public String toString() {
        String s = "File: SU2022_MonthlySalarySlip_Perry\n";
        s = s + ".........................................\n";
        s = s + "MONTH SALARY SPLIT – Will Perry\n";
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        s = s + "Pay Date: " + formatter.format(date) + "\n";
        s = s + ".........................................\n";
        s = s + "Sale Employee Name: " + employeeName + "\n";
        s = s + "Employee ID: " + employeeID + "\n";
        s = s + "Salary Range: " + salaryRange + "\n";
        s = s + "Position ID: " + positionID + "\n";
        s = s + ".........................................\n";
        s = s + "Base Month Salary: " + String.format("%.2f", getMonthlySalary()) + "\n";
        s = s + "Extra Money: " + String.format("%.2f", getExtraSalary()) + "\n";
        s = s + "Month Salary: " + String.format("%.2f", getTotalSalary()) + "\n";
        return s;
    }

}