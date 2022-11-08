package maharishi;

public class guthrieSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
		int res=isGuthrieSequence(arr);
		if(res==1) {
			System.out.println("The sequence is guthrie");
		}else {
			System.out.println("The Sequence is not guthrie");
		}
	}
	
	public static int isGuthrieSequence(int[] a) {
		int ret=0;
		for(int i=0;i<a.length;i++) {
			if(a[0]<1) {
				break;
			}
			
			if(a[i]%2==0) {
				
				if(a[i+1]!=a[i]/2) {
					break;
				}
			}else {
				if(a[i]==a[a.length-1] && a[i]==1) {
					ret=1;
					break;
				}
				if(a[i+1]!=a[i]*3+1) {
					break;
				}
			}
		}
		return ret;
	}

}
