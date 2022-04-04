package oct26;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int x=sc.nextInt();
		Student s[]=new Student[x];
		
		for(int i=0;i<s.length;i++) {
			Student stu=new Student();
			System.out.println("Enter rollno");
			int rn=sc.nextInt();
			stu.setRollno(rn);
			System.out.println("enter name");
			String n=sc.next();
			stu.setName(n);
			s[i]=stu;
			
		}
		for(int j=0;j<s.length;j++)
		{
			Student st=s[j];
			
			System.out.println(st.getRollno());
			System.out.println(st.getName());
		}
	}

}
