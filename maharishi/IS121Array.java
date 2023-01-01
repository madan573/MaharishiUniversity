package maharishi;

public class IS121Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,1,2,2,2,1,1};
		int res = is121Array(a);
		System.out.println(res);
	}
	static int is121Array(int [] a) {
		if(a[0]!=1 || a[a.length/2]!=2 || a.length<=2) return 0;
		int last=a.length-1;
		for(int i=0;i<=last;i++) {
			if(a[i]==1) {
				if(a[last]!=1) return 0;
			}
			if (a[i]==2 ) {
				if(a[last]!=2) return 0;
			}
			if(a[i]!=1 && a[i]!=2 ) return 0;
			last --;
		}
		return 1;
	}

}
