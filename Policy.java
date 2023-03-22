public class Policy
{
   private String number; // Policy number
   private String providerName; // Insurance Provider's name
   private static int numPolicies = 0; // The number of policies that have been created
   private PolicyHolder policyholder; // The policyholder
   
   /**
      No-arg Constructor
   */
   public Policy()
   {
      String number = "-";
      providerName = "-";
      numPolicies++;
   }
   
   /**
      Constructor
      @param number The user's policy number
      @param providerName The user's insurance policy provider
      @param policyholder The policyholder
   */
   public Policy(String number, String providerName, PolicyHolder policyholder)
   {
      this.number = number;
      this.providerName = providerName;
      numPolicies++;
      this.policyholder = new PolicyHolder(policyholder);
      
   }
   
   /**
      Gets the policyholder's policy number
      @return The policy number
   */
   public String getPolicyNumber()
   {
      return number;
   }
   
   /**
      Sets a new value for the policyholder's policy number
      @param p The new policy number
   */
   public void setPolicyNumber(String p)
   {
      number = p;
   }
   
   /**
      Gets the insurance provider's name
      @return The provider's name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      Sets a new value for the insurance provider's name
      @param n The new provider name
   */
   public void setProviderName(String n)
   {
      providerName = n;
   }
   
   /**
      Gets the number of policies
      @return The number of policies
   */
   public int getNumPolicies()
   {
      return numPolicies;
   }
   
   /**
      Accesses the PolicyHolder object
      @return The PolicyHolder object
   */
   public PolicyHolder getPolicyHolder()
   {
      return policyholder;
   }
   
   /**
      Calculates and returns the price of the insurance policy
      @return The price of the insurance policy
   */
   public double getPolicyPrice()
   {
      final double BASE_FEE = 600; // The base fee of the insurance policy is $600
      double price = BASE_FEE;
      
      final int AGE_THRESHOLD = 50;
      final double ADDITIONAL_FEE_AGE = 75;
      
      final int BMI_THRESHOLD = 35;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final double ADDITIONAL_FEE_SMOKING = 100;
      
      // If the policyholder is over 50 years old, there is an additional fee of $75
      if(policyholder.getAge() > AGE_THRESHOLD)
      {
         price += ADDITIONAL_FEE_AGE;
      }
      
      // If the policyholder is a smoker, there is an additional fee of $100
      if(policyholder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         price += ADDITIONAL_FEE_SMOKING;
      }
      
      // If the policyholder's BMI is over 35, an additional fee is calculated based on their BMI
      if(policyholder.getBMI() > BMI_THRESHOLD)
      {
         price += ((policyholder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
      }
      
      // Return the final price of the policyholder's insurance policy
      return price;
   }
   
   /**
      Displays the object as a string
      @return String representation of the object
   */
   public String toString()
   {
      return "Policy Number: " + number + "\n" +
             "Provider Name: " + providerName + "\n" +
             policyholder +
             "Policy Price: " + String.format("$%.2f", getPolicyPrice()) + "\n";
   }
}