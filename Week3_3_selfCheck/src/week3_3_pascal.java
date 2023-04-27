
public class week3_3_pascal {
/*1. Show that the formula for the interior elements of a Pascal triangle row 
 is correct by evaluating it for each interior element of the last row. 

2. What happens if you make a copy of an array of object references 
 using method System.arraycopy ? If the objects referenced by the new 
 * array are changed, how will this affect the original array? 

3. Assume there is no initializer list for the Pascal triangle 
and you are trying to build up its rows. If row i has been defined, 
write statements to create row i + 1 .
*/
	public week3_3_pascal() {}
		// TODO Auto-generated constructor stub
		
		public static int pascalSum(int[][] pascal) {
		
		int sum = 0;
		for (int row = 0; row < pascal.length; row++)
			for (int col = 0; col < pascal[row].length; col++)
					{sum += pascal[row][col];}
		return sum;
		
		}
		public static int[] generateNextRow(int[] row) {
			
			int[] outputRow = new int[row.length+1];
			
			
			if(row.length == 1) {
				outputRow[0] =1;
				outputRow[1] =1;
				return outputRow;
			}
			else {
					
			for (int i =0; i< outputRow.length; i++ ) {
				
				if(i == 0) {
					outputRow[i] = 1;
				}
				else if (i >0 && i < outputRow.length-1) {
					outputRow[i] = row[i-1]+row[i];
				}
				else if (i == outputRow.length-1) {
					outputRow[i] = 1;
				}
			}
			
			return outputRow;}
			
		
			
			}
	
//		
//		int[][] pascal = {
//	 			{1}, // row 0
//	 		  {1, 1}, // row 1
//	 		{1, 2, 1},
//	 	   {1, 3, 3, 1},
//	 	  {1, 4, 6, 4, 1},
//	 };
	
		  public static void printArray(int[] input){
		        for(int i = 0; i < input.length; i++){
		            System.out.print(input[i] + " || ");
		        }
		    }
		

	public static void main(String[] args) {
		int [][] pascalInput = {{1},{1,1},{1,2,1},{1,3,3,1},
				{1,4,6,4,1}}; 
//		System.out.println(pascalSum(pascalInput));
		
		// verify the sum of (row 3, col 0+1) is equal to  (row 4 col 1)
		int i=0; //set row to get sum of
		int j=0; //set col start
		
		
		for(i=1; i<pascalInput.length-1;i++) {
			for (j=0; j<pascalInput[i].length-1; j++) {
				int sumPos = pascalInput[i][j]+pascalInput[i][j+1];
				
				System.out.println("sumPos of \ti: "+i+"\tj: "+j+ " is "+ sumPos);
				System.out.println("pos i+1 j+1 is : "+pascalInput[i+1][j+1]);
			}
		}
		// loop to take the row i  sum col j0 and j1 , and test equal to row i+1 col j0+1
		//int testSumPos1 = pascalInput[i][0]+pascalInput[3][1];
		
		System.out.println(pascalInput[3][0]+ " "+pascalInput[3][1]);
		
		int[] a = {1,2,1};
//		
//		for(int z = 0; z<pascalStart.length+1; z++) {
//			System.out.print(generateNextRow(pascalStart)[z]+" ");
//		}
		
		int[] temp = generateNextRow(a);
		printArray(temp);
		
		 
		
		
				 
	}
}


