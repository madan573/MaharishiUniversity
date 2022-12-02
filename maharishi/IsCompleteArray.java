package maharishi;

public class IsCompleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {36,-28};
		System.out.println(isComplete(a));
	}
	static int isComplete(int[] a) {
		if(a.length<2) {
			return 0;
		}
		int isSum=0;
		int isEven=0;
		int isSquare=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(isSquare==0) {
				if(isSquare(a[i])) {
					isSquare=1;
				}
			}
			if(isEven==0) {
				if(a[i]%2==0) {
					isEven=1;
				}
			}
			
			if(sum!=8) {
				for(int j=i+1;j<a.length;j++) {
					sum = a[i]+a[j];
					if(sum==8) {
						isSum=1;
					}
				}
			}
			if(isEven==1 && isSquare==1 && isSum==1) {
				return 1;
			}
		}
		return 0;
	}
	static boolean isSquare(int n) {
		for(int i=1;i*i<=n;i++) {
			if(i*i==n)
				return true;
		}
		return false;
	}
}
