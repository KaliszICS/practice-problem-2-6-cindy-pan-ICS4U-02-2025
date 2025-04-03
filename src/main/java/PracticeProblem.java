public class PracticeProblem {
	
	public static int[] bubbleSort(double[] nums){
		int[] h= {0,0};
		int countcomp = 0;
		int countswap = 0;
		boolean sorted = true;
		for (int j = 0; j<nums.length-1; j++){
			sorted = false;
			for (int i = 0; i < nums.length -1 - j; i++){
				countcomp++;
				if (nums[i]>nums[i+1]){
					countswap = countswap +3;
					double temp = nums[i];
					nums[i] = nums [i+1];
					nums [i+1] = temp;
					sorted = true;
				}
			}
		if (!sorted){
			j = nums.length+1;
			h[1] = countcomp;
			h[0] = countswap;
		}
		}
		
		return h;
	}
	public static int[] selectionSort(double[] nums){
		int[] help={0,0};
		int countcomp = 0;
		int countswap = 0;

		for (int i= 1; i<nums.length; i++){
			int min = i;
			for (int j = i+1; j<nums.length; j++){
				countcomp++;
				if()
			}
		}

		return help;
	}
	public static int[] insertionSort(double[] nums){
		int help[]= {0,0};
		return help;
	}

}
