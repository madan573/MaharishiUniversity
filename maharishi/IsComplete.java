package maharishi;

public class IsComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-5, 6, 2, 3, 2, 5,4, 11, 8, 7};
		System.out.print(isComplete(a));
	}
	static int isComplete(int[] a) {
		int cEven=0, min=0, max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				min=a[i];
				max=a[i];
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) { 
				cEven++;
				if(min>a[i])min=a[i];
				if(max<a[i]) max=a[i];
			}
		}
		if(cEven==0 || min == max) return 0;
		int bit;
		for(int i=0;i<a.length;i++) {
			bit=0;
			for(int j=0; j<a.length;j++){
					if( a[j]==min){
						bit = 1;
						min++;
						break;
					}
			}
			if(bit==0) {
				return 0;
			}
			if(min==max) {
				return 1;
			}
		}
		return 1;
	}
}
