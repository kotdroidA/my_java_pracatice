class Min{
	public static void main(String[] args) {
		int [] arr={6,3,2,67,8};
		int min =arr[0];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}