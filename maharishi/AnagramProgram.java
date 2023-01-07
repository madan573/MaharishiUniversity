package maharishi;

public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] first = {'p','i','g','g'};
		char[] second = {'i','g','m','i'};
		int res = areAnagrams(first,second);
		System.out.println(res);
	}
	static int areAnagrams(char[] a, char[] b) {
		if(a.length!=b.length) return 0;
		if(a.length==0 && b.length==0) return 1;
		int ret=0;
		int [] c = new int[a.length];
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==a[j]) 	count++;
			}
			c[i]=count;
		}
		for(int i=0;i<a.length;i++) {
			int count=0;
				for(int j=0;j<b.length;j++) {
					if(a[i]==b[j]) {
						count++;
					}
				}
				if(count!=c[i]) return 0;
				else ret=1;
		}
		if(ret==1) return 1;
		return 0;
	}
}
