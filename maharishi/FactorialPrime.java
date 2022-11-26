package maharishi;

public class FactorialPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = isFactorialPrime(11);
		System.out.print(res);
	}
	static int isFactorialPrime(int n) {
		if(n<2) {
			return 0;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		int result = isfactorial(n);
		if(result==1) {
			return 1;
		}else {
			return 0;
		}
	}
	static int isfactorial(int a) {
		int fact=1, ret =0;
		for(int i=1;i<a;i++) {
			fact=fact*i;
			if((fact+1)==a) {
				ret=1;
				break;
			}
			if(fact>a) {
				break;
			}
		}
		return ret;
	}
}
