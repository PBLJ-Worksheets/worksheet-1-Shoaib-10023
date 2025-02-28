import java.util.Scanner;
public class exp1 {
    
    public static void main(String[] args){
        String[][] employeeData = {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
    };

    // System.out.println("Emp No.\tEmp Name\tJoin Date\tDesig Code\tDept\tBasic\tHRA\tIT");
    // System.out.println("-----------------------------------------------------------------------------");

    // for (int i = 0; i < employeeData.length; i++) {
    //     for (int j = 0; j < employeeData[i].length; j++) {
    //         System.out.print(employeeData[i][j] + "\t");
    //     }
    //     System.out.println();
    // }
    String employeeID ;
    System.out.print("Enter employee id :");
    Scanner sc = new Scanner(System.in);
    employeeID = sc.next();
    sc.close();

    String designation = "";
    int da = 0;
    

    for (int i = 0; i < employeeData.length; i++) {
        String[] employee = employeeData[i];
        if (employee[0].equals(employeeID)) {
            String desCode = employee[3];
            //System.out.println("Employee ID: " + employee[0]);
            //System.out.println("Employee Name: " + employee[1]);
            //System.out.println("Join Date: " + employee[2]);
            //System.out.println("Designation Code: " + employee[3]);
            //System.out.println("Department: " + employee[ 4]);
            //System.out.println("Salary: " + employee[5]);
            //System.out.println("Bonus: " + employee[6]);
            //System.out.println("Deductions: " + employee[7]);
        
            //break;

            switch (desCode) {
                case "e":
                    designation = "Engineer";
                    da = 20000;
                    break;
                case "c":
                    designation = "Consultant";
                    da = 32000;
                    break;
                case "k":
                    designation = "Clerk";
                    da = 12000;
                    break;
                case "r":
                    designation = "Receptionist";
                    da = 15000;
                    break;
                case "m":
                    designation = "Manager";
                    da = 40000;
                    break;
                default:
                    System.out.println("Invalid designation code for employee ID: " + employeeID);
                    return;
                }
            // System.out.println("Employee ID: " + employee[0]);
            System.out.println("Employee Name: " + employee[1]);
            System.out.println("Join Date: " + employee[2]);
            System.out.println("Designation Code: " + desCode);
            System.out.println("Designation: " + designation);
            System.out.println("Department: " + employee[4]);
            System.out.println("Salary: " + employee[5]);
            System.out.println("Bonus: " + employee[6]);
            System.out.println("Deductions: " + employee[7]);
            System.out.println("da: " + da);
            break;
        }
        else{
            System.out.println("Employee not found with ID: " + employeeID);
            break;
        }
    }

    }
    
}