package maharishi;

public class FancyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isFancy(17));
	}
	static int isFancy(int n) {
		if(n==1) return 1;
		int first=1, second=1,temp;
		while((3*second+2*first)<=n) {
			temp=3*second+2*first;
			first=second;
			second=temp;
			if(temp==n) return 1;
		}
		return 0;
	}
}
