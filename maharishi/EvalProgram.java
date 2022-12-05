package maharishi;

public class EvalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,2,1};
		double res = eval(3,a);
		System.out.print(res);
	}
	static double eval(double x,int[] a) {
		double sum=a[0];
		double num;
		for(int i=1;i<a.length;i++) {
			num=1;
			for(int j=1;j<=i;j++) {
				num = num*x;
			}
			sum = sum +a[i]*num;
		}
		return sum;
	}
}
