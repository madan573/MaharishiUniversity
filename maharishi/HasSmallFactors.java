package maharishi;

public class HasSmallFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(hasKSmallFactors(10,22));
	}
	static boolean hasKSmallFactors(int k, int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				if(i<k && n/i<k)
				{
					return true;
				}
			}
		}
		return false;
	}
}
