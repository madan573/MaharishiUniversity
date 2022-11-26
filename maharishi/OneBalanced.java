package maharishi;

public class OneBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,1,2,3,1};
		int res = isOneBalanced(a);
		System.out.print(res);
	}
	static int isOneBalanced(int[] a) {
		int total1s = 0;
        int totalNon1s = 0;
        boolean non1Start = false;
        boolean non1End = false;
        if (a.length == 0) return 1;
        for (int number : a) {
            if (number == 1) {
                if (non1Start) non1End = true;
                total1s++;
            } else {
                if (non1End) return 0;
                non1Start = true;
                totalNon1s++;
            }
        }
        if (total1s != totalNon1s) return 0;
        return 1;
        }
}
