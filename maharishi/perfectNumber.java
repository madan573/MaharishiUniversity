package maharishi;

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = henry(1,3);
		System.out.println(res);
	}
	public static int henry(int i,int j) {
		int  c=0,sum=0,sum1=0;
		for(int n=4;n<Integer.MAX_VALUE;n++) { 
			sum=0;
			for(int a=1;a<n;a++) {
				if(n%a==0) {
					sum+=a;
				}
			}
			
			if(sum==n) {
				c++;
				if(c==i) {
					sum1=sum;
				}
				if(c==j) {
					sum = sum1+sum;
					break;
				}
			}
			
		}
		return sum;
	}

}
