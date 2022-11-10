package maharishi;

public class Solve10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] result = solve10();
		System.out.println(result[0] +" "+result[1]);
	}
	public static int [] solve10() {
		int [] r= new int[2];
		int tenfact=fact(10);
		int sum=0;
		int xfact=1,yfact=1;		
		for(int i=9;i>=1;i--) {
			xfact=fact(i);
			for(int j=1;j<=9;j++) {
			yfact=fact(j);
			sum = xfact + yfact;
				if(tenfact==sum) {
					r[0]= i;
					r[1]=j;
					return r;
				}
				if(tenfact<sum) {
					break;
				}	
			}
		}
		return r;
	}
	public static int fact(int n) {
		
		if(n==0||n==1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
		}
	
}
