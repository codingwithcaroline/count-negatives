/**
 * Applies the linear scan strategy to counting the number of negative
 * values in an array.
 *
 * @author Caroline Kirkconnell (Cek0037@auburn.edu)
 * @version 2019-09-08
 */
public class CountNegatives {

   /**
    * Returns the number of negative values in the given array.
    */
   public static int countNegatives(int[]a) {
     int count=0; //include a counter here
      for (int negativeCount = 0; negativeCount < a.length; negativeCount++) {
         if (a[negativeCount] < 0) {
             count++;//increment a counter
         }
      }
      return count; //return the number of negatives
   }
}
