/**
 * Best Score

    Given an array, write a function to get first, second best scores from the array and return it in new array.

    Array may contain duplicates.

    xample

    myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
    firstSecond(myArray) // {90, 87}
 */

 public class BestScores {

    public static void main(String[] args) {
        int[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        int[] result = firstSecond(myArray);
        System.out.println(Arrays.toString(result));
    }

    public static int[] firstSecond(int[] array) {
        Arrays.sort(array); // Sort the array in ascending order
        int n = array.length;
        // The last two elements after sorting are the first and second best scores
        int[] result = {array[n - 1], array[n - 2]};
        return result;
    }
}

 /**
  * Intstructor's solution
  * 
  * import java.util.Arrays;
    import java.util.Collections;

    public class Exercise {
        public static int[] findTopTwoScores(int[] array) {
            int firstHighest = Integer.MIN_VALUE;
            int secondHighest = Integer.MIN_VALUE;
     
            for (int score : array) {
                if (score > firstHighest) {
                    secondHighest = firstHighest;
                    firstHighest = score;
                } else if (score > secondHighest && score < firstHighest) {
                    secondHighest = score;
                }
            }
     
            return new int[]{firstHighest, secondHighest};
        }
    }
  */