package maharishi;

public class centerFifteen {
	public static void main(String[] args) {
		int[] arr = {1,1,14,2};
		System.out.println(isCentered15(arr));
	}
	public static int isCentered15(int[] a) {
		int left=0, right=a.length-1,sum=0;
		while(left<=right) {
			for(int i=left;i<=right;i++) sum+=a[i];
			if(sum==15) return 1;
			left++;
			right--;
			sum=0;
		}
		return 0;
	}
}
