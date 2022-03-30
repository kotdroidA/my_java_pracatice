//Write a program to print a string entered by user
class Example{
	public static void main(String []args){
	   int num[]={8,2,3,5,7,9,0,1,4,6};
	   int n=num.length;
	   int temp=0;
	   for(int i=0;i<n;i++){
	   	for(int j=1;j<n;j++){
	   		if(num[i]>num[j]){
	   			temp=num[i];
	   			num[i]=num[j];
	   			num[j]=temp;
	   		}

	   	}

	   }
	   	for(int v=0;v<n;v++){
	   		System.out.print(num[v]+",");
	   	}
	   // padho 
	   
	}

}