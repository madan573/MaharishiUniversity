package maharishi;

public class NewCompleteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2, 3, 2, 4, 11, 6, 10, 9, 8};
		System.out.print(isComplete(a));
	}
	static int isComplete(int[] a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) return 0;
			if(a[i]%2==0 && a[i]>max) {
				max=a[i];
			}
		}
		int min=2,flag=1;
		for(int i=1;i<max/2;i++) {
			for(int j=0;j<a.length;j++) {
				if(min==a[j]) {
					flag=1;
					min=min+2;
					break;
				}else {
					flag=0;
				}
			}
			if(flag==0) {
				return 0;
			}
			if(min==max) return 1;
		}
		return 0;
	}
}
