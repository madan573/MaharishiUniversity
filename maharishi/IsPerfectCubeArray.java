package maharishi;

public class IsPerfectCubeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {-8,27,-64};
		System.out.print(isPerfectCube(a));
	}
	static int isPerfectCube(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(!isCube(a[i])) {
				return 0;
			}
		}
		return 1;
	}
	static boolean isCube(int n) {
		if(n<0) {
			n=n*-1;
		}
		int cube=0;
		for(int i=1;(i*i*i)<=n;i++) {
			cube=i*i*i;
		}
		if(cube==n)
			return true;
		else
			return false;
	}
}
