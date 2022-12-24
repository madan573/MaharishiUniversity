package maharishi;

public class BunkerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isBunker(16));
	}
	static int isBunker(int n) {
		int num=1;
		for(int i=1;(i+num)<=n;i++) {
			num+=i;
		}
		if(num==n) return 1;
		return 0;
	}
}
