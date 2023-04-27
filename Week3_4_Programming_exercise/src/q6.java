

public class q6 {

	public q6() {}
	    static char[][] letters = new char[5][];

	    public static void allocateSpace(String next){
	    	
	    	char arr[]=next.toCharArray();
	    	
	    	for(int i=0;i<letters.length;i++){
	    		if(letters[i]==null) {
	    		letters[i] = new char[next.length()]; // instantiate each index of the array 
	    		for(int j = 0; j < arr.length; j++) {
		    			
		    			letters[i][j] = arr[j];
	    		}
	    		break;
	    		}
	    	}
	    	
	    }

	    public static void printLetters(){
	        for(int i = 0; i < 5; i++){
	            if (letters[i] != null){
	                for (int j = 0; j < letters[i].length; j++){
	                    System.out.print(letters[i][j]);
	                }
	                System.out.println("");
	            }else{
	                break;
	            }
	        }
	    
	    }    
	public static void main(String[] args) {
		allocateSpace("hello");
			
		allocateSpace("bye");
		printLetters();
		printLetters();
	}

}
