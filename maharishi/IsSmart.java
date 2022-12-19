package maharishi;

public class IsSmart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isSmart(16));
	}
	static int isSmart(int n) {
		int sum=1;
		for(int i=1;sum<n;i++) {
			sum=sum+i;
		}
		if(sum==n) return 1;
		return 0;
	}
}
