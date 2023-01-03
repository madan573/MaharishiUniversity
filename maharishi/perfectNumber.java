package maharishi;
public class perfectNumber {
	public static void main(String[] args) {
		int res = henry(1,3);
		System.out.println(res);
	}
	public static int henry(int i,int j) {
		int  count=0,sum=0;
		for(int n=1;n<Integer.MAX_VALUE;n++) { 
			if(isPerfect(n)==1) {
				count++;
				if(count==i) sum+=n;
				if(count==j) {
					sum+=n;
					break;
				}
			}
		}
		return sum;
	}
	static int isPerfect(int m) {
		int sum=0;
		for(int i=1;i<m;i++) {
			if(m%i==0) sum+=i;
		}
		if(sum==m) return 1;
		return 0;
	}

}
