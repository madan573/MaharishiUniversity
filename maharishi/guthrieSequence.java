package maharishi;

public class guthrieSequence {

	public static void main(String[] args) {
		int[] arr = {7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
		System.out.println (isGuthrieSequence(arr));
	}
	
	public static int isGuthrieSequence(int[] a) {
	if(a[0]<1 && a[a.length-1]!=1) return 0;		
for(int i=0;i<a.length-1;i++) {
		if(a[i]%2==0) {
			if(a[i+1]!=a[i]/2) return 0;
		}else {
			if(a[i+1]!=a[i]*3+1) return 0;			
		}
	}
	return 1;
	}
}
