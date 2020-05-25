package start;
import java.util.Scanner;

public class Start
{

	public static void main(String[] args)
	
	{
		
		Scanner sc=new Scanner(System.in);
		
		
		
		int position=sc.nextInt();
		int base=sc.nextInt();
		int increment=sc.nextInt();
		int allowance=sc.nextInt();
		int income=sc.nextInt();
		System.out.println("the position is "+position);
		System.out.println("the base is "+base);
		System.out.println("the increment is "+increment);
		System.out.println("the allowance is "+allowance);
		System.out.println("the income is "+income);
		
		
		totalsalary(position,base,increment);
		
		totalsalary(income,allowance);
		
		
	}
	
	public static void totalsalary(int position,int base,int increment)
	
	{
		
		int fullsalary=base+(position*increment);
		System.out.println("the salary is "+fullsalary);
		
		
	}
	
	
public static void totalsalary(int income ,int allowance)
	
	{
		
		int grosssalary=income+allowance;
		System.out.println("the salary is "+grosssalary);
		
		
	}
	
	
	
}
