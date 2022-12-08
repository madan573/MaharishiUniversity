package maharishi;

public class AllEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isEvens(2246));
	}
	static int isEvens(int n) {
		while(n>0) {
			if(((n%10)%2)==1) return 0;
			n/=10;
		}
		return 1;
	}
}
