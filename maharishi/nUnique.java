package maharishi;

public class nUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,3,1};
		int res=isNUnique(a,6);
		System.out.println(res);
	}
	public static int isNUnique(int[]a,int b) {
		int r=0,c=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==b) {
					c++;
					if(c>=2) {
						r=0;
						break;
					}
					if(c==1) {
						r=1;
					}
				}
			}
		}
		return r;
	}

}
