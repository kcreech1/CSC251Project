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
      
      // Variables to track the number of policyholders that are smokers
      int smokerAmount = 0;
      
      
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
         
         // Create a PolicyHolder object using the inputted information
         PolicyHolder policyholder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         
         // Create a Policy object using the PolicyHolder object
         Policy policy = new Policy(policyNumber, providerName, policyholder);
         
         // Add the Policy object to the ArrayList
         policies.add(policy);
      }
      
      // Close PolicyInformation
      inputFile.close();
      
      // Display all of the policies in the ArrayList
      for(Policy pol : policies)
      {
         System.out.println(pol); // Print the policy
         System.out.println(pol.getPolicyHolder()); // Print the policyholder
         
         // Determine if the policyholder was a smoker
         if(pol.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerAmount++;
         }
      }
      
      // Display the number of policies, smokers, and non-smokers
      System.out.println("There were " + policies.get(0).getNumPolicies() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerAmount);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokerAmount));
   }
}