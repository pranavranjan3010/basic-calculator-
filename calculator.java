package Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	int choice,n,i,fact=1,count=0,x=0,y=1,z,r,rev=0,t;
	float a,b;
	    System.out.println("**CALCULATOR***");
		System.out.println("------------------------------------------------");
		do
		{
		System.out.println("\n1.for the addtion\n2.for the substraction\n3.for the division\n4.for the multiplication\n5.for the modulas\n6.for the facatorial\n7.for the prime number\n8.for the fibonacci series\n9.for the palindrome number\n10.for the table of the number");
		System.out.println("-------------------------------------------------");
		System.out.println("enter the choice\n");
		Scanner Scan =new Scanner(System.in);
		choice=Scan.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the two numbers\n");
			a=Scan.nextFloat();
			b=Scan.nextFloat();
			float sum=a+b;
			System.out.println("Sum of the numbers is ="+sum);
			break;
		case 2:
			System.out.println("Enter the two numbers\n");
			a=Scan.nextFloat();
			b=Scan.nextFloat();
			float sub=a-b;
			System.out.println("Substraction of the numbers is ="+sub);
			break;
		case 3:
			System.out.println("Enter the two numbers\n");
			a=Scan.nextFloat();
			b=Scan.nextFloat();
		    float div=a/b;
		    System.out.println("division of the numbers is ="+div);
		   break;
		case 4:
			System.out.println("Enter the tw numbers\n");
			a=Scan.nextFloat();
			b=Scan.nextFloat();
			float mul=a*b;
		    System.out.println("multiplication of the numbers is ="+mul);
			break;
		case 5:
			System.out.println("Enter the two numbers\n");
			a=Scan.nextFloat();
			b=Scan.nextFloat();
			float mod=a%b;
			System.out.println("modulas of the numbers is ="+ mod);
			break;
		case 6:
			System.out.println("Enter the number\n");
			n=Scan.nextInt();
			for(i=1;i<=n;i++)
			{
				fact=fact*i;
				
			}
			System.out.println("factorial of the number is ="+fact);
			break;
		case 7:
			System.out.println("enter the number\n");
			n=Scan.nextInt();
			for(i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
			break;
		case 8:
		  System.out.println("enter the elements\n");
		  n=Scan.nextInt();
		  for(i=1;i<=n;i++)
		  {
			  z=x+y;
			  System.out.println(x);
			  x=y;
			  y=z;
		  }
		  break;
		case 9:
			System.out.println("Enter the number\n");
			 n=Scan.nextInt();
			 t=n;
			 while(n>0)
			 {
				 r=n%10;
				 n=n/10;
				 rev=rev*10+r;
			 }
			 if(rev==t)
			 {
				 System.out.println("Palindrome number");
			 }
			 else
			 {
				 System.out.printf("Not a Planidrome number");
			 }
			 break;
		case 10:
			System.out.println("Enter the number\n");
			 n=Scan.nextInt();
		    for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		    break;
		    default :
		    	System.out.println("Plz choose the valid option");
			break;
		}
		System.out.println("\n------------------------------------------------------------------\n");
		
		
		}while(choice!=10);
		
		
		

	}

}
