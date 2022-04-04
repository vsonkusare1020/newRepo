package oct26;

public class Odd {
	public static void main(String[] args) {
		int a[]= {10,12,13,14,15,17};
		/*for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}*/
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
	}

}
