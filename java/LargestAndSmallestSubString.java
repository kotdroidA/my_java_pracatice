class LargestAndSmallestSubString{
	public static void main(String[] args) {
	   String str="This is an umbrella.";
	   String word[]= str.split(" ");
	   String largest="";
	   String smallest="";
	   for(int i=1;i<word.length;i++){
	   	  String s=word[i];
	   	   if(s.compareTo(word[i-1])>0){
	   	   	 largest=s;
	   	   } 
	   	   if(s.compareTo(word[i-1])<0){
	   	   	 smallest=s;
	   	   }
	   	}
	   	System.out.println(largest);
	   	System.out.println(smallest);
        
	}
}