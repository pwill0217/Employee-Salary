import java.util.Scanner;

public class SU2022_EmployeeSalarySlip_Perry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = in.nextLine();
        System.out.print("Enter your employee ID: ");
        String id = in.nextLine();
        System.out.print("What is your salary range(1-4): ");
        int range = Integer.parseInt(in.nextLine());
        System.out.print("Enter your position ID: ");
        String positionId = in.nextLine();
        SU2022_Employee_Perry employee = new SU2022_Employee_Perry(name, id, range, positionId);
        System.out.println(employee);
    }
}
