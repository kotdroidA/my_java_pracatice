class ShortArray{
	public static void main(String[] args) {
		int[] shortArray = {2,3,1,45,15};
		
		for(int i=0; i<shortArray.length;i++){
			if(shortArray[i]>shortArray[i+1]&&i!=3){
				shortArray[i]=shortArray[i+1];
			}
		}
		for(int i=0;i<shortArray.length;i++){
			System.out.print(shortArray[i]);
		}
	}
}