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
      Displays the object as a string
      @return String representation of the object
   */
   public String toString()
   {
      return "Policy Number: " + number + "\n" +
             "Provider Name: " + providerName;
   }
}