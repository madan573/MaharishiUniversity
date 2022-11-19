package maharishi;

public class PatternMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,1,2,3,3,3,6,0,0,0};
		int [] p = {1,2,3,6,0};
		int res = matchPattern(a,a.length,p,p.length);
		System.out.println(res);
	}
	static int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
		int i=0; 
		int k=0; 
		int matches = 0; 
		for(i=0; i<len; i++) {
			if(a[i]==pattern[k]) {
				matches++;
			}else if(matches == 0 || k == patternLen-1) {
				return 0;
			}else {
				k++;
				i--;
				matches=0;
			} 
		}
		if (i==len && k==patternLen-1) return 1; else return 0;
	}
}
