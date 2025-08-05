import java.util.Scanner;
class SmartCafe
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice,quantity,price,total=0;
char more;
System.out.println("Welcome to smart cafe");
System.out.println("1.Coffee"+"\n"+"2.Tea"+"\n"+"3.Sandwich"+"\n"+"4.Burger"+"\n"+"5.Exit");
do{
    System.out.println("Enter your choice:");
choice=sc.nextInt();
System.out.println("Enter your quantity");
quantity=sc.nextInt();
switch(choice)
{
case 1:System.out.println("Entered your Coffee: ");
       total=total+(quantity*35);
	   break;
case 2:System.out.println("Entered your Tea: ");
       total=total+(quantity*25);
	   break;
case 3:System.out.println("Entered your Sandwich");
       total=total+(quantity*30);
	   break;
case 4:System.out.println("Entered your Burger");
       total=total+(quantity*40);
	   break;
default:System.out.println("Invalid choice");
}
System.out.println("Any more (y/n)");
more=sc.next().charAt(0);
}while(more=='y');
System.out.println("Total Bill:"+total);
System.out.println("Thanks for visiting!");
}
}

        
		
		
		
		
		
		
		