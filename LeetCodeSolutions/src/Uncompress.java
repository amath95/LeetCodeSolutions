import java.util.*;


/* Write a function, that takes in a string as an argument. 
The input string will be formatted into multiple goups according 
to the following pattern:

<number><char>
for example '2c' ->cc
or '3a' ->aaa

Approach:

    variable: number, char, list of numbs, output

    Check the peek item at each iteration. 
    If number dequeue concatenate to number string else dequeue make equal to char.
				



*/

public class Uncompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(uncompress("2c3b10t"));

	}
	
	
	
	
	// Returns  a string of character value printed a specified number of times 
	public static String printLetter(int number, char character) {
		
		   String outputString="";
		    for(int i =0; i<number; ++i){
		        outputString+=character;
		    }

		    return outputString;
		
	}


	
	public static String uncompress(String inputString) {
		
		String output="";
		String number = "";
		Character singleLetter = new Character('\0');
	    String listOfNumbers = "0123456789";
	    Queue <Character> input = new LinkedList<Character>();
	  
	    //Add values to queue 
	    for(char letter : inputString.toCharArray())
	    	input.add(letter);
	    
	    
	    while(!input.isEmpty()) {

	    	//Checks if the top of the queue is a digit and adds to number string if satisfied 
	    	if(listOfNumbers.contains(input.peek().toString())){number+= input.poll();}
	    	else {
	    		
							//Save character from queue
	    		singleLetter = input.poll();

							//Concactenate results of print letter to output 
	    		output+= printLetter(Integer.parseInt(number),singleLetter); 
	    		number = "";  	
	    	}
	    
	    		
	    }
	       
		
		return output;
		
	}
	
	

}