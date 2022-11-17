package maharishi;

public class MinMaxDisjoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,4,1,4,2,3};
		int res = isMinMaxDisjoint(arr);
		System.out.println(res);
	}
	static int isMinMaxDisjoint(int[] a ) {
		int ret=1,minterm=a[0],maxterm=a[0];
		for(int i=0;i<a.length;i++) {
			if(minterm>a[i]) {
				minterm=a[i];
			}
			if(maxterm<a[i]) {
				maxterm=a[i];
			}
		}
		if(minterm==maxterm) {
			ret=0;
			return ret;
		}
		int mincount=0,maxcount=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]==minterm) {
				mincount++;
			}
			if(a[j]==maxterm) {
				maxcount++;
			}
			if(maxcount>1||mincount>1) {
				ret=0;
				break;
			}
			if(j==a.length-1) {
				break;
			}
			if(a[j]==minterm && a[j+1]==maxterm ||a[j]==maxterm && a[j+1]==minterm) {
				ret = 0;
				break;
			}
		}
		return ret;
	}

}
