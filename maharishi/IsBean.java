package maharishi;

public class IsBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,7,3,6};
		System.out.print(isBean(a));
	}
	static int isBean(int[] a) {
		int arr=0;
		for(int i=0; i<a.length;i++) {
			
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]*2 || a[i]==(a[j]*2+1) || a[i]==a[j]/2) {
					arr=1;
					break;
				}else {
					arr=0;
				}
			}
			if(arr==0) return 0;
		}
		if(arr==1) return 1;
		return 0;
	}
}
