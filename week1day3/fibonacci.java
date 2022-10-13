package week1day3;

public class fibonacci {
	public static void main(String[] args) {
		int n=10;
		int j=1,k=1,l=1,m;
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		for(int i=4;i<=n;i++)
		{
			m=j+k+l;
			System.out.println(m);
			j=k;
			k=l;
			l=m;
		}

		}
}
