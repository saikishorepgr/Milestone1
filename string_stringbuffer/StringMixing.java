package string_stringbuffer;

public class StringMixing {
	 	public static void main(String[] args) 
	 	{
	 		String s=args[0];
	 		String s1=args[1];
	 		char c[]=s.toCharArray();
	 		char d[]=s1.toCharArray();
	 		int j,k;
	 		int e=c.length;
	 		int f=d.length;
	 		if(e==f)
	 		{
	 			for(j=0;j<c.length;j++)
	 			{
	 				System.out.print(c[j]);
	 				for(k=j;k<=j;k++)
	 				{
	 				
	 					System.out.print(d[k]);
	 				}
	 			}
	 		}
	 		else
	 		{
	 			int p=0;
	 			for(j=0;j<c.length;j++)
	 			{
	 				System.out.print(c[j]);
	 				for(k=j;k<=j;k++)
	 				{
	 				
	 					System.out.print(d[k]);
	 					p++;
	 				}
	 			}
	 			for(j=p;j<d.length;j++)
	 			{
	 				System.out.print(d[j]);
	 			}
	 		}
	 	}	
	 }