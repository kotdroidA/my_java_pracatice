import java.util.*;

public class RockPaperScissors{
	
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Let's Play Rock, Paper, Scissor...\nPlease enter your move or q to quit.");
		String userMove = sc.nextLine();
		
		
		int computerMove = (int)(Math.random()*3);
		
		// 0 -> Rock, 1 -> Paper, 2 -> Scissor
		
		while(!userMove.toLowerCase().equals("q")){
		    
		    
		    if(!userMove.toLowerCase().equals("rock")&&
		       !userMove.toLowerCase().equals("paper")&&
		       !userMove.toLowerCase().equals("scissor"))
		       {
		          System.out.println("You have entered invalid move. Please try again...."); 
		          
		    }else{
		        if( (computerMove==0 && userMove.toLowerCase().equals("rock"))||
		            (computerMove==1 && userMove.toLowerCase().equals("paper"))||
		            (computerMove==2 && userMove.toLowerCase().equals("scissor"))
		            ){
		                System.out.println("Math draw..."); 
		          } else if(
		              (computerMove==0 && userMove.toLowerCase().equals("paper"))||
		              (computerMove==1 && userMove.toLowerCase().equals("scissor"))||
		              (computerMove==2 && userMove.toLowerCase().equals("rock"))
		              ){
		                    System.out.println("You won.."); 
		              }else{
		                  System.out.println("You lost.."); 
		              }      
		    }
		    
		    computerMove = (int)Math.random()*3;
		    System.out.println("Please enter your move to play.. or q to quit.");
		    userMove = sc.nextLine();
		    
		    
		    
		   
		}

    }
}