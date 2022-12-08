package maharishi;

public class FilterArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {7,9,11};
		System.out.print(isFilter(a));
	}
	static int isFilter(int[] a ) {
		int nine=0,seven=0,eleven=0,thirteen=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==9) {
				nine=1;
			}
			if(a[i]==11 ) {
				eleven=1;
			}
			if(a[i]==7 ) {
				seven=1;
			}
			if(a[i]==13 ) {
				thirteen=1;
			}
		}
		if(nine==1 && eleven==0 || seven==1 && thirteen ==1) {
			return 0;
		}
		return 1;
}
}