package maharishi;

public class arrayOrder {

	public static void main(String[] args) {
		int[] arr = {3,2,3,1};
		int num = 3231;
		System.out.println(repsEqual(arr,num));
	}
	public static int repsEqual(int a[], int n) {
		int i=a.length-1,m=n,count=0;
		while(m!=0) {
			m=m/10;
			count++;
		}
		if(count!=a.length) return 0;
		while(n!=0) {
			if(n%10!=a[i]) return 0;
			n = n/10;
			i--;
		}
		return 1;
	}

}
