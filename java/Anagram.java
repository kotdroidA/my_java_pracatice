import java.util.*;
class Anagram{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("please enter any two string.");
	  String s=sc.nextLine();
	  String s1=sc.nextLine();
	  int count=0;
	   for(int i=0;i<s.length();i++){
           for(int j=0;j<s1.length();j++){
            	if(s.equals(s1)){
            		;
            	}
	  	    }
	    }
	    if(count==s.length()){
	    	System.out.println("yes");
	    }
	  
	}
}