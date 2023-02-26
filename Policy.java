public class Policy
{
   private String number; // Policy number
   private String providerName; // Insurance Provider's name
   private String firstName; // Policyholder's first name
   private String lastName; // Policyholder's last name
   private int age; // Policyholder's age
   private String smokingStatus; // Policyholder's smoking status (smoker or non-smoker)
   private double height; // Policyholder's height in inches
   private double weight; // Policyholder's weight in pounds
   
   /**
      No-arg Constructor
   */
   public Policy()
   {
      String number = "-";
      providerName = "-";
      firstName = "-";
      lastName = "-";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0.0;
      weight = 0.0;
   }
      /**
         Constructor
         @param userNumber The user's policy number
         @param userProviderName The user's insurance policy provider
         @param userFirstName The user's first name
         @param userLastName The user's last name
         @param userAge The user's age
         @param userSmokingStatus The user's smoking status (smoker or non-smoker)
         @param userHeight The user's height in inches
         @param userWeight The user's weight in pounds
      */
      public Policy(String userNumber, String userProviderName, String userFirstName, String userLastName, int userAge, String userSmokingStatus, double userHeight, double userWeight)
      {
         number = userNumber;
         providerName = userProviderName;
         firstName = userFirstName;
         lastName = userLastName;
         age = userAge;
         smokingStatus = userSmokingStatus;
         height = userHeight;
         weight = userWeight;
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
      
      /**
         Accesses the policyholder's first name
         @return The policyholder's first name
      */
      public String getFirstName()
      {
         return firstName;
      }
      
      /**
         Sets a new first name for the policyholder
         @param n The policyholder's new first name
      */
      public void setFirstName(String f)
      {
         firstName = f;
      }
      
      /**
         Accesses the policyholder's last name
         @return The policyholder's last name
      */
      public String getLastName()
      {
         return lastName;
      }
      
      /**
         Sets a new last name for the policyholder
         @param l The policyholder's new last name
      */
      public void setLastName(String l)
      {
         lastName = l;
      }
      
      /**
         Accesses the policyholder's age
         @return The policyholder's age
      */
      public int getAge()
      {
         return age;
      }
      
      /**
         Sets a new age for the policyholder
         @param a The policyholder's new age
      */
      public void setAge(int a)
      {
         age = a;
      }
      
      /**
         Accesses the smoking status of the policyholder
         @return The policyholder's smoking status
      */
      public String getSmokingStatus()
      {
         return smokingStatus;
      }
      
      /**
         Sets a new smoking status for the policyholder
         @param s The policyholder's new smoking status
      */
      public void setSmokingStatus(String s)
      {
         smokingStatus = s;
      }
      
      /**
         Accesses the policyholder's height
         @return The policyholder's height
      */
      public double getHeight()
      {
         return height;
      }
      
      /**
         Sets a new height for the policyholder
         @param h The policyholder's new height
      */
      public void setHeight(double h)
      {
         height = h;
      }
      
      /**
         Accesses the policyholder's weight
         @return The policyholder's weight
      */
      public double getWeight()
      {
         return weight;
      }
      
      /**
         Sets a new weight for the policyholder
         @param w The policyholder's new weight
      */
      public void setWeight(double w)
      {
         weight = w;
      }
      
      /**
         Calculates and returns the BMI of the policyholder
         @return The policyholder's BMI
      */
      public double getBMI()
      {
         final int CONVERSION_FACTOR = 703;
      
         return (weight * CONVERSION_FACTOR) / (height * height);
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
         if(age > AGE_THRESHOLD)
         {
            price += ADDITIONAL_FEE_AGE;
         }
         
         // If the policyholder is a smoker, there is an additional fee of $100
         if(smokingStatus.equalsIgnoreCase("smoker"))
         {
            price += ADDITIONAL_FEE_SMOKING;
         }
         
         // If the policyholder's BMI is over 35, an additional fee is calculated based on their BMI
         if(getBMI() > BMI_THRESHOLD)
         {
            price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         }
         
         // Return the final price of the policyholder's insurance policy
         return price;
      }
}