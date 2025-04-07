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
			
		}
		}
		h[1] = countcomp;
			h[0] = countswap;
		return h;
	}


	public static int[] selectionSort(double[] nums){
		int[] help={0,0};
		int countcomp = 0;
		int countswap = 0;

		for (int i= 0; i<nums.length; i++){
			int min = i; //swap 1
			countswap++;
			for (int j = i+1; j<nums.length; j++){
				countcomp++;
				if(nums[j]<nums[min]){
					min = j;
				
				}
			}
				double temp = nums[i]; 
				nums[i]=nums[min]; //swap 3
				nums[min]=temp; //swap 4
				countswap=countswap+3;	
		}
		help[1]=countcomp;
		help[0] = countswap;
		return help;
	}
	public static int[] insertionSort(double[] nums){
		int help[]= {0,0};
		int countcomp = 0;
		int countswap = 0;

		for (int i = 1; i < nums.length; i++) {
			countswap++;
			double key = nums[i];
			int index = i - 1;
			while (index >= 0 && nums[index] > key) { //check for -1 first
				nums[index + 1] = nums[index];
				index--;
				countcomp++;
				countswap++;
			}
			nums[index + 1] = key;
			countswap++;
		}
		help[1]=countcomp;
		help[0] = countswap;
		return help;
	}


	public static String leastIterations(double[] nums){
		int len = nums.length;
		double[] bubble = new double[len];
		double[] sele = new double [len];
		double[] insert = new double [len];
		for (int a =0; a<len; a++){
			bubble[a] = nums[a];
			sele[a] = nums[a];
			insert[a] = nums[a];
		}


		int countbubble = bubbleSort(bubble)[1];
		int countcompSelection = selectionSort(sele)[1];
		int countInsert = insertionSort(insert)[1];
		
		if (countbubble <= countInsert && countbubble <= countcompSelection){
			return "Bubble";
		}
		else if (countInsert <= countcompSelection){
			return "Insertion";
		}
		else {
			return "Selection";
		}
	}



	public static String leastSwaps(double[] nums){
		int len = nums.length;
		double[] bubble = new double[len];
		double[] sele = new double [len];
		double[] insert = new double [len];
		for (int a =0; a<len; a++){
			bubble[a] = nums[a];
			sele[a] = nums[a];
			insert[a] = nums[a];
		}


		int countbubble = bubbleSort(bubble)[0];
		int countcompSelection = selectionSort(sele)[0];
		int countInsert = insertionSort(insert)[0];
		System.out.println(countInsert);
		System.out.println(countbubble);
		System.out.println(countcompSelection);
		
		if (countbubble <= countInsert && countbubble <= countcompSelection){
			return "Bubble";
		}
		else if (countInsert <= countcompSelection){
			return "Insertion";
		}
		else {
			return "Selection";
		}
		

	}
}
