class Circularly{
	public static void main(String[] args) {
		int[] arr ={1,2,3,4,5};
		int temp=arr[1];
		for(int i=0;i<arr.length-1;i++){
			
			arr[i+1]=arr[i-1];
			System.out.println("Circularly number"+i+"="+arr[i]);
		}

	}
}