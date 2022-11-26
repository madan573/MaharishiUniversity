package maharishi;

public class IsFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isFibonacci(21));
	}
	static int isFibonacci(int n) {
		int first =1; 
		int second =1;
		int temp;
		if(n<1) return 0;
		for(int i=1;i<n;i++) {
			temp = first+second;
			if(temp>n) {
				break;
			}
			if(temp==n) {
				return 1;
			}
			first=second;
			second=temp;
		}
		return 0;
	}
}
