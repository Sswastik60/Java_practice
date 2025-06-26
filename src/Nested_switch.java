import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String EmpID= in.nextLine();
        // Nested switch statement
        switch (EmpID) {
            case "E001" -> {
                System.out.println("Employee ID: E001");
                System.out.print("Enter department: ");
                String department = in.nextLine();
                switch (department) {
                    case "HR" -> System.out.println("Department: HR");
                    case "IT" -> System.out.println("Department: IT");
                    case "Finance" -> System.out.println("Department: Finance");
                    default -> System.out.println("Invalid Department");
                }
            }
            case "E002" -> System.out.println("Employee ID: E002");
            case "E003" -> System.out.println("Employee ID: E003");
            default -> System.out.println("Invalid Employee ID");
        }
    }
}           
            
        
    
    
