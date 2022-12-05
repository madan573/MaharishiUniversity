package maharishi;

public class SameNumberOfFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(sameNumberOfFactors(23,97));
	}
	static int sameNumberOfFactors(int n1, int n2) {
		if(n1<0 || n2<0) {
			return -1;
		}
		if(countFactor(n1)==countFactor(n2)) {
			return 1;
		}else {
			return 0;
		}
	}
	static int countFactor(int n) {
		int count=2;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count ++;
			}
		}
		return count;
	}
}
