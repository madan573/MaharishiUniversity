package maharishi;

public class PairwiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,-3,4,5,6};
		int[] b = pairwiseSum(a);
		if(b!=null) {
			for(int i:b)
				System.out.println(i);	
		}else {
			System.out.println("null");
		}
	}
	static int[] pairwiseSum(int[] a) {
		
		if(a.length%2==1) {
			
			return null;
		}
		int[] b = new int[a.length/2];
		for(int i=0,j=0;i<a.length;i=i+2) {
			b[j]=a[i]+a[i+1];
			j++;
		}
		return b;
	}
}
