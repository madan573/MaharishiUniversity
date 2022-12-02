package maharishi;

public class IS121Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,1,2,2,2,1,1};
		int res = is121Array(a);
		System.out.println(res);
	}
	static int is121Array(int [] a) {
		int r=0,count=0;
		if(a[0]!=1 || a.length<=2) {
			return 0;
		}
		for(int i=0,j=a.length-1;i<=j;i++,j--) {
			
			if(a[i]==1) {
				if(a[j]!=1) {
					r=0;
					break;
				}
			}
			if(a[j]==1) {
				if(a[i]!=1) {
					r=0;
					break;
				}
			}
			if (a[i]==2 ) {
				if(a[j]==2) {
					count++;	
				}else {
					r=0;
					break;
				}
				
			}
			if(a[i]==0||a[i]==3||a[i]==4||a[i]==5||a[i]==6||a[i]==7||a[i]==8||a[i]==9 ){
				r=0;
				break;
			}
		}
		if(count>0) {
			r=1;
		}
		return r;
	}

}
