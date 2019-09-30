/**
* Rhet Kelly
* 09/30/19
* Activity_05
* Performs operations on a given value.
*/

public class NumberOperations
{
   private int number;


/**
* @param numberIn is the number integer
*/

   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   
   /**
   * @return returns the number
   */

   public int getValue()
   {
      return 0; // placeholder return
   }
   
   /**
   * @return returns the output
   */
   
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
   * @return returns a string of numbers
   */
   
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t"; // concatenate to output
         powers = powers * 2; // get next power of 2
      }
      return output;
      
   }
   
   /**
   * @return returns positive or negative number
   * @param compareNumber is to compare the input
   */
   
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else
      {
         return 0;
      }
   
   }
   
   /**
   * @return returns the numbers
   */
      
   public String toString()
   {
      return number + "";
   }

}