package maharishi;

public class LargestAdjacentSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,2,3,4,-5};
		int res = largestAdjacentSum(a);
		System.out.println(res);
	}
	static int largestAdjacentSum(int[] a) {
		int largestSum=0;
		if(a.length<=1) {
			return 0;
		}
		for(int i=0;i<a.length-1;i++) {
			if(a[i]+a[i+1]>largestSum) {
				largestSum=a[i]+a[i+1];
			}
		}
		return largestSum;
	}

}
