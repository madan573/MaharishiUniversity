package maharishi;

public class isSquareProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isSquare(5);
		System.out.println(result);
	}
	public static int isSquare(int n) {
	int r=0;
	for (int i=1;i<n;i++) {
		if(i*i==n) {
			r=1;
			break;
		}
	}
	return r;
	}
}
