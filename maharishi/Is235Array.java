package maharishi;

public class Is235Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,9,27,7,1,1,1,1,1};
		int res = is235Array(a);
		System.out.print(res);
	}
	static int is235Array(int[] a) {
		int two=0,three=0,five=0,others=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0 && a[i]%3!=0 && a[i]%5!=0) {
				others++;
			}
			if(a[i]%2==0) {
				two++;
			}
			if(a[i]%3==0) {
				three++;
			}
			if(a[i]%5==0) {
				five++;
			}
		}
		if((two+three+five+others)==a.length) {
			return 1;
		}else {
			return 0;
		}
	}
}
