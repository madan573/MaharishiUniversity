package maharishi;
public class LastEven {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,5};
		System.out.print(lastEven(a));
	}
	static int lastEven(int[] a) {
		int even=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) even=i;
		}
		return even;
	}
}
