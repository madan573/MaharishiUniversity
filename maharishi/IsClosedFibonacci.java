package maharishi;

public class IsClosedFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isClosedFibonacci(100));
	}
	static int isClosedFibonacci(int n) {
		if(n<1) return 0;
		int first=1,second=1, temp=0,num=0;
		for(int i=1;i<n;i++) {
			temp=first+second;
			if(temp>=n) {
				num=second;
				break;
			}
			first=second;
			second=temp;
		}
		return num;
	}
}
