package maharishi;

public class countDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(CountDigit(33331,3));
	}
	static int CountDigit(int n, int m) {
		if(n<0) return -1;
		int count=0;
		while(n>0) {
			if(n%10==m) count++;
			n/=10;
		}
		return count;
	}
}
