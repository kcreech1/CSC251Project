import java.util.*;
import java.io.*;

public class Project_kerry_creech
{
   public static void main(String[] args) throws IOException
   {
      // Variables
      int age;
      String policyNumber, providerName, firstName, lastName, smokingStatus;
      double height, weight;
      
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
      }
      
      // Close PolicyInformation
      inputFile.close();
      
   }
}