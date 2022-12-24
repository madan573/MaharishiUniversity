package maharishi;

public class SumIsPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,8,8,8};
		System.out.print(sumIsPower(a));
	}
	static int sumIsPower(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		while(sum!=1) {
			if(sum%2==1) return 0;
			sum/=2;
		}
		if(sum==1) return 1;
		else return 0;
	}
}
