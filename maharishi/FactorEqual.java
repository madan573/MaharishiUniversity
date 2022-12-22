package maharishi;

public class FactorEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(factorEqual(10,33));
	}
	static int factorEqual(int n,int m) {
		int nfact=2,mfact=2;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) nfact++;
		}
		for(int j=2;j<=m/2;j++) {
			if(m%j==0) mfact++;
		}
		if(mfact==nfact) return 1;
		else return 0;
	}
}
