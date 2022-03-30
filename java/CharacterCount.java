import java.util.*;
class CharacterCount{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any String.");
		String str=sc.nextLine();
		int vowelsCount=0,consonentsCount=0,digitsCount=0,whiteSpaceCount=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
            switch(c){
            	case 'a': vowelsCount++;
            	break;
            	case 'e': vowelsCount++;
            	break;
            	case 'i': vowelsCount++;
            	break;
            	case 'o': vowelsCount++;
            	break;
            	case 'u': vowelsCount++;
            	break;
            	case 'b': consonentsCount++;
            	break;
            	case 'c': consonentsCount++;
            	break;
            	case 'd': consonentsCount++;
            	break;
            	case 'f': consonentsCount++;
            	break;
            	case 'g': consonentsCount++;
            	break;
            	case 'h': consonentsCount++;
            	break;
            	case 'j': consonentsCount++;
            	break;
            	case 'k': consonentsCount++;
            	break;
            	case 'l': consonentsCount++;
            	break;
            	case 'm': consonentsCount++;
            	break;
            	case 'n': consonentsCount++;
            	break;
            	case 'p': consonentsCount++;
            	break;
            	case 'q': consonentsCount++;
            	break;
            	case 'r': consonentsCount++;
            	break;
            	case 's': consonentsCount++;
            	break;
            	case 't': consonentsCount++;
            	break;
            	case 'v': consonentsCount++;
            	break;
            	case 'w': consonentsCount++;
            	break;
            	case 'x': consonentsCount++;
            	break;
            	case 'y': consonentsCount++;
            	break;
            	case 'z': consonentsCount++;
            	break;
            	case 'A': vowelsCount++;
            	break;
            	case 'E': vowelsCount++;
            	break;
            	case 'I': vowelsCount++;
            	break;
            	case 'O': vowelsCount++;
            	break;
            	case 'U': vowelsCount++;
            	break;
            	case 'B': consonentsCount++;
            	break;
            	case 'C': consonentsCount++;
            	break;
            	case 'D': consonentsCount++;
            	break;
            	case 'F': consonentsCount++;
            	break;
            	case 'G': consonentsCount++;
            	break;
            	case 'H': consonentsCount++;
            	break;
            	case 'J': consonentsCount++;
            	break;
            	case 'K': consonentsCount++;
            	break;
            	case 'L': consonentsCount++;
            	break;
            	case 'M': consonentsCount++;
            	break;
            	case 'N': consonentsCount++;
            	break;
            	case 'P': consonentsCount++;
            	break;
            	case 'Q': consonentsCount++;
            	break;
            	case 'R': consonentsCount++;
            	break;
            	case 'S': consonentsCount++;
            	break;
            	case 'T': consonentsCount++;
            	break;
            	case 'V': consonentsCount++;
            	break;
            	case 'W': consonentsCount++;
            	break;
            	case 'X': consonentsCount++;
            	break;
            	case 'Y': consonentsCount++;
            	break;
            	case 'Z': consonentsCount++;
            	break;

            	case ' ': whiteSpaceCount++;
            	break;
            	case '0': digitsCount++;
            	break;
            	case '1': digitsCount++;
            	break;
            	case '2': digitsCount++;
            	break;
            	case '3': digitsCount++;
            	break;
            	case '4': digitsCount++;
            	break;
            	case '5': digitsCount++;
            	break;
            	case '6': digitsCount++;
            	break;
            	case '7': digitsCount++;
            	break;
            	case '8': digitsCount++;
            	break;
            	case '9': digitsCount++;
            	break;
            }
        } 
        System.out.println(vowelsCount+"\n"+consonentsCount+"\n"+digitsCount+"\n"+whiteSpaceCount);

            int vowelsCount1=0,consonentsCount1=0,digitsCount1=0,whiteSpaceCount1=0;

        for(int i=0;i<str.length();i++){
        	char c=str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        	 vowelsCount1++;
            }
            else if(c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='p'||c=='q'||c=='r'||c=='s'||
        	  c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z'||c=='B'||c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'
        	  ||c=='N'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'){
 
        	  consonentsCount1++;
            }
            else if(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){
        	   digitsCount1++;
            }
           else if(c==' '){
        	  whiteSpaceCount1++;
            }
        }


 

       
        System.out.println(vowelsCount1+"\n"+consonentsCount1+"\n"+digitsCount1+"\n"+whiteSpaceCount1);
    }	
}