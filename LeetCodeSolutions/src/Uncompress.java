import java.util.*;


/* Write a function, that takes in a string as an argument. 
The input string will be formatted into multiple goups according 
to the following pattern:

<number><char>
for example '2c' ->cc
or '3a' ->aaa

Approach:

    variable: number, char, list of numbs, output

    Dequeue and check each item thats dequeued. 
    If number concatenate to number string else make equal to char.



*/

public class Uncompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(uncompress("2c3b10t"));

	}
	
	
	
	
	
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
	  
	    
	    for(char letter : inputString.toCharArray())
	    	input.add(letter);
	    
	    
	    while(!input.isEmpty()) {
	    	
	    	if(listOfNumbers.contains(input.peek().toString())){number+= input.poll();}
	    	else {
	    		
	    		singleLetter = input.poll();
	    		output+= printLetter(Integer.parseInt(number),singleLetter); 
	    		number = "";  	
	    	}
	    
	    		
	    }
	       
		
		return output;
		
	}
	
	

}