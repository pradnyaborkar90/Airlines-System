import java.io.*;
import java.util.*;
import java.lang.Math.*;
import  java.util.InputMismatchException;

interface Header
{
	final String head="/*************************************************** QATAR AIRLINES *******************************************************************/";
	public void displayhead();
}

class Customer
{
String name;
String address;
String gender;
int age;
	Customer()throws InputMismatchException
	{
	boolean bError = true;
		 do 
		 {
			try
			{ 
			Scanner sc=new Scanner(System.in);
			System.out.println();
			System.out.println("enter Name ,Address ,Gender ,Age");
			name=sc.nextLine();
			address=sc.nextLine();
			gender=sc.nextLine();
			age=sc.nextInt();
			bError = false;
			}
			catch(Exception e)
			{
				System.out.println("Error!");
			}
		}while(bError);
	}

	void displaycust()
	{
	System.out.println("*NAME:"+name);
	System.out.println("*GENDER:"+gender+"                               "+"*AGE:"+age);
	}

}

abstract class Ticket
{
	String destination;
	String source;
	String date;
	String time;
	int x;
	abstract  void getdetails();
	abstract public void display();
	 void displaystatus()
	{
	Status st=new Status();
	st.showstatus(x);
	}
  
}

///International class
class International extends Ticket implements Header  //inheritance and interface
{		int children,adults;
		static int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count12=0,count11=0,count;
		static float tax=1000.00f;
		float amount;
		float totalamount;
		int country;
		int flight;
		International()
		{	int y,u;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Date (dd/mm/yy):");
			 date=sc.nextLine();
			do
			{y=0;
				System.out.println("PRESS  1)INDIA TO LONDON");
				System.out.println("PRESS  2)INDIA TO AMERICA");
				System.out.println("PRESS  3)INDIA TO FRANCE");
				System.out.println("PRESS  4)INDIA TO RUSSIA");
				country=sc.nextInt();
				if(country<=0||country>4)
				{	y=1;
				System.out.println("wrong option please type again");
				}	
			
			}while(y==1);

			do
			{u=0;
				switch(country)
				{
					case 1:System.out.println("PRESS OPTIONS	TIME OF FLIGHT		TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("1  		   12:00		   22 HRS		  48,000	");
							System.out.println("2  		   01:38		   22 HRS		  50,000	");
							System.out.println("3  		   03:53		   20 HRS		  60,000	");
							flight=sc.nextInt();
							if(flight<1||flight>3)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					case 2:  System.out.println("PRESS OPTIONS	TIME OF FLIGHT		TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("4  			12:00		    22 HRS		  48,000	");
							System.out.println("5  			01:38		    22 HRS		  50,000	");
							System.out.println("6  			03:53		    20 HRS		  60,000	");
							flight=sc.nextInt();
							if(flight<4||flight>=7)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					case 3:System.out.println("PRESS OPTIONS	TIME OF FLIGHT		TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("7  			12:00		      22 HRS		  48,000	");
							System.out.println("8  			01:38		      22 HRS		  50,000	");
							System.out.println("9  			03:53		      20 HRS		  60,000	");
							flight=sc.nextInt();
							if(flight<7||flight>9)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					case 4:System.out.println("PRESS OPTIONS	   TIME OF FLIGHT		TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("  10  		 12:00	                  22 HRS	         48,000	");
							System.out.println("  11  		 01:38		          22 HRS		  50,000	");
							System.out.println("  12  		 03:53		          20 HRS		  60,000	");
							flight=sc.nextInt();
							if(flight<10||flight>12)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					default:System.out.println("NO FLIGHTS AVAILABLE");
				}
			}while(u==1);
			
        }

		public	void getdetails()
		{
			source="INDIA";


			switch(flight)
			{
			case 1:	destination="LONDON";
				time="12:00";
				amount=48000;
				break;
				
			case 2:destination="LONDON";
				time="01:38";
				amount=50000;
				break;
			case 3:destination="LONDON";
				time="03:53";
				amount=60000;
				break;
			case 4:destination="AMERICA";
				time="12:00";
				amount=48000;
				break;
			case 5:destination="AMERICA";
				time="01:38";
				amount=50000;
				break;
			case 6:destination="AMERICA";
				time="03:53";
				amount=60000;
				break;
			case 7:destination="RUSSIA";
				time="12:00";
				amount=48000;
				break;
			case 8:destination="RUSSIA";
				time="01:38";
				amount=50000;
				break;
			case 9:destination="RUSSIA";
				time="03:53";
				amount=60000;
				break;
			case 10:destination="FRANCE";
				time="12:00";
				amount=48000;
				break;
			case 11:destination="FRANCE";
				time="01:38";
				amount=50000;
				break;
			case 12:destination="FRANCE";
				time="03:53";
				amount=60000;
				break;
			default:System.out.print("no flights available");

			}

		}
		
		public void displayhead()
		{
		System.out.println(head);
		}
		
		public	void display()//to veiw details.
		{
		
		System.out.println("*SOURCE:"+source+"                           "+"*DESTINATION:"+destination);
		System.out.println("*DATE:  "+date+"                              "+"*TIME:"+time);
		
		}



		public float calculate()
		{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter no of adults");
		 adults=sc.nextInt();
		System.out.print("enter no of children(below 5 years)\n");
		 children=sc.nextInt();
			switch(flight)
			{
			case 1: count1=count1+children+adults;
				count=count1;
				break;
			case 2:count2=count2+children+adults;
				count=count2;
				break;
			case 3:count3=count3+children+adults;
				count=count3;
				break;
			case 4:count4=count4+children+adults;
				count=count4;
				break;
			case 5:count5=count5+children+adults;
				count=count5;
				break;
			case 6:count6=count6+children+adults;
				count=count6;
				break;
			case 7:count7=count7+children+adults;
				count=count7;
				break;
			case 8:count8=count8+children+adults;
				count=count8;
				break;
			case 9:count9=count9+children+adults;
				count=count9;
				break;
			case 10:count10=count10+children+adults;
				count=count10;
				break;
			case 11:count11=count11+children+adults;
				count=count1;
				break;
			case 12:count12=count12+children+adults;
				count=count12;
				break;
			default:
			}
		 totalamount=amount*adults+amount*0.5f*children+tax;
		 x=status(count);
		 
		return totalamount;
		}
		
		int status(int t)
		{
		if(t<=56)
		return 1;
		else
		return 0;
		}
		
}

///Domestic class
class Domestic extends Ticket implements Header		//inheritance and interface
{
	int state;
	int flight;
	float damount;
	float dtotalamount;
	static int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0, count10=0, count11=0, count12=0, count;
	
		Domestic()
		{
			int y,u;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Date (dd/mm/yy):");
			 date=sc.nextLine();
			do
			{y=0;
			System.out.println("PRESS  1)MUMBAI TO GOA ");
			System.out.println("PRESS  2)MUMBAI TO DELHI");
			System.out.println("PRESS  3)MUMBAI TO KOLKATA");
			System.out.println("PRESS  4)MUMBAI TO AMRITSAR");
			state=sc.nextInt();
				if(state<=0||state>4)
				{
				y=1;
				System.out.println("wrong option please type again");
				}
			}while(y==1);

			
			do
			{u=0;
				switch(state)
				{
					case 1:System.out.println("PRESS OPTIONS  TIME OF FLIGHT	TIME TAKEN TO REACH    TICKET FARE");
							System.out.println("  1  		  14:00		     1HR 45MIN 		     3,490	");
							System.out.println("  2  		  11:35		     1HR 15MIN		     3,570	");
							System.out.println("  3  		  07:15		     1HR 00MIN		     4,600	");
							flight=sc.nextInt();
							if(flight<1||flight>3)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					case 2: System.out.println("PRESS OPTIONS  TIME OF FLIGHT  TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("  4  		   18:00		  2HRS  15MIN 		    3,000	");
							System.out.println("  5  		   11:35		  2HRS  10MIN	        3,495	");
							System.out.println("  6  		   03:50		  2HRS	OOMIN	        4,900	");
							flight=sc.nextInt();
							if(flight<4||flight>6)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					case 3:System.out.println("PRESS OPTIONS  TIME OF FLIGHT  TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("  7  		   23:00		   5HRS	10MIN	        6,470	");
							System.out.println("  8  		   19:30		   5HRS	05MINS	        7,120	");
							System.out.println("  9  		   10:50		   4HRS	15MINS	        7,800	");
							flight=sc.nextInt();
							if(flight<7||flight>9)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					case 4:System.out.println("PRESS OPTIONS  TIME OF FLIGHT	TIME TAKEN TO REACH    TICKET PRICE");
							System.out.println("  10  		   21:00	        6HRS 20MIN		     8,500	");
							System.out.println("  11  		   15:15		    6HRS  10MIN		     7,130	");
							System.out.println("  12  		   8:30		        5HRS  30MIN          6,900	");
							flight=sc.nextInt();
							if(flight<10||flight>12)
							{System.out.println("wrong option please type again");
							u=1;
							}
							break;
					default:System.out.println("NO FLIGHTS AVAILABLE");
						
				}
			}while(u==1);
        }
	
	
	public	void getdetails() //to get details from customer
	{ boolean b=true;
		source="MUMBAI";
		do
		{
			try
			{
				switch(flight)
					{
					case 1:	destination="GOA";
						time="14:00";
						damount=3490;
						 count= count1;
						break;
					case 2:destination="GOA";
						time="11:35";
						damount=3570;
						 count= count2;
						break;
					case 3:destination="GOA";
						time="07:15";
						damount=4600;
						 count= count3;
						break;
					case 4:destination="DELHI";
						time="18:00";
						damount=3000;
						 count= count4;
						break;
					case 5:destination="DELHI";
						time="11:35";
						damount=3495;
						 count= count5;
						break;
					case 6:destination="DELHI";
						time="03:50";
						damount=4900;
						 count= count6;
						break;
					case 7:destination="KOLKATA";
						time="23:00";
						damount=6470;
						 count= count7;
						break;
					case 8:destination="KOLKATA";
						time="19:30";
						damount=7120;
						 count= count8;
						break;
					case 9:destination="KOLKATA";
						time="10:50";
						damount=7800;
						 count= count9;
						break;
					case 10:destination="AMRITSAR";
						time="20:00";
						damount=8500;
						 count= count10;
						break;
					case 11:destination="AMRITSAR";
						time="15:15";
						damount=7130;
						 count= count11;
						break;
					case 12:destination="AMRITSAR";
						time="8:30";
						damount=6900;
						 count= count12;
						break;
					default:System.out.print("no flights available");
					}
				b=false;
			}
			catch(Exception e)
			{
			System.out.print("error");
			}
		}while(b);
			
	}
	
	public void displayhead()//to display header
	{
	System.out.println(head);
	}
	
		public void display()  //to veiw detailsof customer.
		{
		System.out.println("*SOURCE:"+source+"                          "+"*DESTINATION:"+destination);
		System.out.println("*DATE:"+date+"                              "+"*TIME:"+time);
		
		
		}



		public float calculate()  //method to calculate amount
		{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter no of adults");
		 int adults=sc.nextInt();
		System.out.print("enter no of chhildren(below 5 years)\n");
		 int children=sc.nextInt();
			switch(flight)
			{
			case 1: count1=count1+children+adults;
				count=count1;
				break;
			case 2:count2=count2+children+adults;
				count=count2;
				break;
			case 3:count3=count3+children+adults;
				count=count3;
				break;
			case 4:count4=count4+children+adults;
				count=count4;
				break;
			case 5:count5=count5+children+adults;
				count=count5;
				break;
			case 6:count6=count6+children+adults;
				count=count6;
				break;
			case 7:count7=count7+children+adults;
				count=count7;
				break;
			case 8:count8=count8+children+adults;
				count=count8;
				break;
			case 9:count9=count9+children+adults;
				count=count9;
				break;
			case 10:count10=count10+children+adults;
				count=count10;
				break;
			case 11:count11=count11+children+adults;
				count=count1;
				break;
			case 12:count12=count12+children+adults;
				count=count12;
				break;
			default:
			}
		 dtotalamount=damount*adults+damount*0.5f*children;
		 x=dstatus(count);
		return dtotalamount;
		}
		
		int dstatus(int t)  
		{
			if(t<=30)
				return 1;
			else
				return 0;
		}
}

class Status
{
 
 
	  void showstatus(int x)
	 {
			if (x==1)
			System.out.println("*STATUS:CONFIRMED TICKET");
			else
			System.out.println("*STATUS:WAITING TICKET");
	 }
}
  

class Airlines
{
	public static void main(String args[])
	{
	Ticket t;
	Scanner sc =new Scanner(System.in);
	System.out.println();
	System.out.println("/***************WELCOME TO QATAR AIRLINE'S TICKET BOOKING PORTAL***************/"); 
	
	Customer cust[]=new Customer[120]; //creating array of customers
		for(int j=0;j<120;j++)
		{
		cust[j]=new Customer();
		System.out.println("PRESS 1:DOMESTIC FLIGHT \n 2:INTERNATIONAL FLIGHT :\n3:FOR DISPLAYING LIST OF CUSTOMERS BOOKED TICKETS ");
		int ch=sc.nextInt();
		
			switch(ch)
			{
			case 1:	Domestic d=new Domestic();
					t=d;    					//Dynamic dispatch method
					t.getdetails();
					float damt=d.calculate();
					d.displayhead();
					cust[j].displaycust();
					
					t.display();
					t.displaystatus();
					System.out.println("*AMOUNT=Rs."+damt);
					System.out.println("                  THANK YOU FOR BOOKING WE WISH YOU WOULD CONTINUE USING OUR SERVICES");
					System.out.println("*******************************************************************************************************************");
					break;
			
			case 2:	International i=new International();
					t=i;					//Dynamic dispatch method
					t.getdetails();
					float amt=i.calculate();
					i.displayhead();
					cust[j].displaycust();
					t.display();
					t.displaystatus();
					
					System.out.println("*AMOUNT=Rs."+amt);
					System.out.println("                  THANK YOU FOR BOOKING WE WISH YOU WOULD CONTINUE USING OUR SERVICES");
					System.out.println("*******************************************************************************************************************");
					break;
					
			case 3:for(int k=0;k<j;k++)
					{
						cust[k].displaycust();
					}	
			
			default:System.out.println("INVALID INPUT");	
			}

		}
		for(int j=0;j<120;j++)
		{
			cust[j].displaycust();
		}
	}
}