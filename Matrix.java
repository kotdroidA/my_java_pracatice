class Matrix{
	public static void main(String[] args) {
		int[][] arr{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]==[j][i]){
					System.out.println("This is Matrix .Symmetric");
				}
				else{
					System.out.println("This is Matrix .not Symmetric");
				}
			}
		}
	}
}