import java.util.Scanner;

public class Project_kerry_creech
{
   public static void main(String[] args)
   {
      int policyNumber, age;
      String providerName, firstName, lastName, smokingStatus;
      double height, weight;
   
      Scanner keyboard = new Scanner(System.in);
      
      
      // Prompt user for the policy number and store it in policyNumber
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      // Clear the keyboard buffer by consuming the newline character, as input is going from numeric data to string data
      keyboard.nextLine();
      
      // Prompt user for the insurance provider name and store it in providerName
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      // Prompt user for the policyholder's first name and store it in firstName
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      // Prompt user for the policyholder's last name and store it in lastName
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      // Prompt user for the policyholder's age and store it in age
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      
      // Clear the keyboard buffer by consuming the newline character, as input is going from numeric data to string data
      keyboard.nextLine();
      
      // Prompt user for the policyholder's smoking status and store it in smokingStatus
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      // Prompt user for the policyholder's height in inches and store it in height
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      // Prompt user for the policyholder's weight in pounds and store it in weight
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      
      // Create a Policy object using user inputs
      Policy userPolicy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      
      // Output values for userPolicy
      System.out.println("Policy Number: " + userPolicy.getPolicyNumber());
      System.out.println("Provider Name: " + userPolicy.getProviderName());
      System.out.println("Policyholder's First Name: " + userPolicy.getFirstName());
      System.out.println("Policyholder's Last Name: " + userPolicy.getLastName());
      System.out.println("Policyholder's Age: " + userPolicy.getAge());
      System.out.println("Policyholder's Smoking Status: " + userPolicy.getSmokingStatus());
      System.out.printf("Policyholder's Height: %.1f\n", userPolicy.getHeight());
      System.out.printf("Policyholder's Weight: %.1f\n", userPolicy.getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", userPolicy.getBMI());
      System.out.printf("Policy Price: $%.2f", userPolicy.getPolicyPrice());
   }
}