package maharishi;

public class MartainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,1,2,1};
		System.out.print(isMartain(a));
	}
	static int isMartain(int[] a) {
		int one=0, two=0;
		for(int i=0;i<a.length;i++) {
			if(i!=a.length-1) {
			if(a[i]==a[i+1]) {
				return 0;
			}
			}
			if(a[i]==1) {
				one++;
			}
			if(a[i]==2) {
				two++;
			}
		}
		if(one>two) {
			return 1;
		}else {
			return 0;
		}
	}
}
