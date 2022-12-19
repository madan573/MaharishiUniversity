package maharishi;

public class SetEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,9,12,2};
		int[] b= {9,1,12,12,9,12};
		System.out.print(isSetEqual(a,b));
	}
	
	static int isSetEqual(int[] a, int[] b) {
		int f=0;
			for(int i=0; i<a.length;i++) {
				f=0;
				for(int j=0;j<b.length;j++) {
					if(a[i]==b[j]) {
						f=1;
						break;
					}
				}
				if(f==0) return 0;
			}
			for(int i=0; i<b.length;i++) {
				f=0;
				for(int j=0;j<a.length;j++) {
					if(b[i]==a[j]) {
						f=1;
						break;
					}
				}
				if(f==0) return 0;	
				}
		
		return 1;
} 
}
