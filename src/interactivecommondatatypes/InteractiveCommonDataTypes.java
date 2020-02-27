
package interactivecommondatatypes;

import java.util.Scanner;

public class InteractiveCommonDataTypes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "Matt", heshe = "He";
        int age = 34, retirement = 70, daysTill = 0;
        double gpa = 3.6;
        boolean isMale;
        
        System.out.print("Enter student's name: ");
        name = input.nextLine();
        System.out.print("Enter student's gpa: ");
        gpa = input.nextDouble();
        System.out.print("Enter student's age: ");
        age = input.nextInt();
        System.out.print("Is student Male? (true/false) ");
        isMale = input.nextBoolean();
        
        heshe = isMale ? "He" : "She";
        daysTill = retirement - age;
        
        System.out.printf("%s is %d years old (%d years to retirement).  %s has a %4.2f gpa.\n", 
                name, age, daysTill, heshe, gpa);
    }
    
}
