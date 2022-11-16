package maharishi;

public class IsStacked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = isStacked(21);
		System.out.println(result);
	}
	static int isStacked(int n) {
		int ret =0;
		for (int i=1;i<=n;i++) {
			if(n==i*(i+1)/2) {
				ret =1;
				break;
			}
			if(n<i*(i+1)/2) {
				ret =0;
				break;
			}
		}
		return ret;
	}

}
