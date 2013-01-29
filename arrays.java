/**
 * Arrays
 *
 * 		Methods for dealing with arrays.
 *
 * 	Kendall Weistroffer 
 */

public class arrays{


	public static void main(String[] args) {
		int[]nums = {3,6,4,3,2,1,5,6};
		System.out.println(average(nums));
	}

	/**
	 * Average
	 * 		Finds the mean of an array.
	 *
	 * @param nums - the array
	 * 
	 * @return the mean
	 */
	public static double average(int[] nums){
		
		return ((double)sum(nums))/nums.length;
	}
	/**
	 * Sum
	 * 		Finds the sum of the numbers in an array.
	 *
	 * @param nums - the array
	 *
	 * @return the sum
	 */
	public static int sum(int[] nums){
		int sum = 0;
		for(int i= 0; i<nums.length; i++){
			sum +=nums[i];

		}return sum;

	}
	/**
	 * Threes
	 * 		Counts how many times three is apparent in the array.
	 *
	 * @param nums - the array
	 *
	 * @return the ammount of threes in the array
	 */
	public static int threes(int[] nums){
		int counter = 0;
		for(int i = 0; i<nums.length; i++){
			if(counter == 3){
				counter++;
			}
		}return counter;
	}
}