package countPairsWithGivenSum;

public class susobhan {
	public static void main(String args[]) {
		int arr[]= {1,5,7,-1,5};
		int key =6;
		int n = arr.length;
		
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if((arr[i]+arr[j])==key) {
					count++;
				}
			}
		}
		System.out.println("Count pairs with given sum");
		System.out.print(count);
	}

}
