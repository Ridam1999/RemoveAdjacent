/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		String str1="acaaabbbcdddd";//acac
		
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int j=0;j<t;j++)
		{
		String str=s.next();
		char ch[]=str.toCharArray();
		int n=ch.length;
		if(ch[0]!=ch[1])
		System.out.print(ch[0]);
		for(int i=1;i<n-1;i++)
		{
		if(ch[i]!=ch[i+1] && ch[i]!=ch[i-1])
		{
		System.out.print(ch[i]);
		}
		}
		if(ch[n-1]!=ch[n-2])
		System.out.print(ch[n-1]);
		}
	}
}
