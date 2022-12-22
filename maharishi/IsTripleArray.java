package maharishi;

public class IsTripleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,1,1,4,3,1,2,4,4,2,3,3};
		System.out.print(isTriple(a));
	}
	/*method 1 using sorting*/
	/*
	static int isTriple(int[] a) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int sum=a[0],uSum=a[0];
		for(int k=1;k<a.length;k++) {
			sum+=a[k];
			if(a[k]==a[k-1]) continue;
			uSum+=a[k];
		}
		if(sum/uSum==3) return 1;
		else return 0;
	} 
	*/
	/*method 2 without sorting*/
	static int isTriple(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i>j && a[i]==a[j]) break;
				if(a[i]==a[j] && i<=j)count++;
			}
			if(count%3!=0) return 0;
			}
		return 1;
	}
}
