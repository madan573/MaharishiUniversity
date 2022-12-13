package maharishi;

public class MeeraNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isMeera(30));
	}
	static int isMeera(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) count++;
		}
		if(n%count==0) return 1;
		return 0;
	}
}
