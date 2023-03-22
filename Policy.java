public class Policy
{
   private String number; // Policy number
   private String providerName; // Insurance Provider's name
   
   /**
      No-arg Constructor
   */
   public Policy()
   {
      String number = "-";
      providerName = "-";
   }
   
   /**
      Constructor
      @param userNumber The user's policy number
      @param userProviderName The user's insurance policy provider
   */
   public Policy(String userNumber, String userProviderName, String userFirstName, String userLastName, int userAge, String userSmokingStatus, double userHeight, double userWeight)
   {
      number = userNumber;
      providerName = userProviderName;
   }
   
   /**
      Accesses the policyholder's policy number
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
      Accesses the insurance provider's name
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
}