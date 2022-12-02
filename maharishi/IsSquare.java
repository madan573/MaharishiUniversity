package maharishi;

public class IsSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isSquare(100));
	}
	static int isSquare(int n) {
		
		for(int i=1;i*i<=n;i++) {
			if(i*i==n)
				return 1;
		}
		return 0;
	}
}
