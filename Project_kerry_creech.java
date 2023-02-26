import java.util.*;
import java.io.*;

public class Project_kerry_creech
{
   public static void main(String[] args) throws IOException
   {
      // Variables for creating a Policy object
      int age;
      String policyNumber, providerName, firstName, lastName, smokingStatus;
      double height, weight;
      
      // Variables to track the number of policyholders that are smokers and number of policyholders that are non-smokers
      int smokerAmount = 0, nonSmokerAmount = 0;
      
      
      // Create an ArrayList to hold Policy Objects
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      // Read from PolicyInformation
      File policyInfoFile = new File("PolicyInformation.txt");
      
      // Scanner to read from PolicyInformation
      Scanner inputFile = new Scanner(policyInfoFile);
      
      // Check if file exists, exit program early if it doesn't exist
      if(!policyInfoFile.exists())
      {
         System.out.println("Unable to locate file.");
         System.exit(0);
      }
      
      // Read data inputs from PolicyInformation as long as the end hasn't been reached
      while(inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine(); // Policy number input
         providerName = inputFile.nextLine(); // Provider name input
         firstName = inputFile.nextLine(); // Policyholder's first name input
         lastName = inputFile.nextLine(); // Policyholder's last name input
         age = inputFile.nextInt(); // Policyholder's age input
         
         // Clear newline character (data input is going from numeric to String)
         inputFile.nextLine();
         
         smokingStatus = inputFile.nextLine(); // Policyholder's smoking status input
         height = inputFile.nextDouble(); // Policyholder's height input
         weight = inputFile.nextDouble(); // Policyholder's weight input
         
         // Consume newline character and skip blank line
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
            inputFile.nextLine();
         }
         
         // Create a Policy object using the inputted information
         Policy userPolicy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         // Add the Policy object to the ArrayList
         policies.add(userPolicy);
         
         // Determine if the policyholder was a smoker or non-smoker, then increment appropriate variable
         if(smokingStatus.equalsIgnoreCase("smoker"))
         {
            smokerAmount++;
         }
         else if(smokingStatus.equalsIgnoreCase("non-smoker"))
         {
            nonSmokerAmount++;
         }
      }
      
      // Close PolicyInformation
      inputFile.close();
      
      // Display all of the policies in the ArrayList
      for(int i = 0; i < policies.size(); i++)
      {
      System.out.println("Policy Number: " + policies.get(i).getPolicyNumber()); // Display policy number
      System.out.println("Provider Name: " + policies.get(i).getProviderName()); // Display provider name
      System.out.println("Policyholder's First Name: " + policies.get(i).getFirstName()); // Display policyholder's first name
      System.out.println("Policyholder's Last Name: " + policies.get(i).getLastName()); // Display policyholder's last name
      System.out.println("Policyholder's Age: " + policies.get(i).getAge()); // Display policyholder's age
      System.out.println("Policyholder's Smoking Status: " + policies.get(i).getSmokingStatus()); // Display policyholder's smoking status
      System.out.printf("Policyholder's Height: %.1f\n", policies.get(i).getHeight()); // Display policyholder's height
      System.out.printf("Policyholder's Weight: %.1f\n", policies.get(i).getWeight()); // Display policyholder's age
      System.out.printf("Policyholder's BMI: %.2f\n", policies.get(i).getBMI()); // Display policyholder's BMI
      System.out.printf("Policy Price: $%.2f\n\n", policies.get(i).getPolicyPrice()); // Display the policy price
      }
      
      // Display the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + smokerAmount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerAmount);
   }
}