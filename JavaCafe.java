//libraries
import java.util.*;
import java.lang.*;


public class JavaCafe
{
    public static void main(String[] args)
	{
	int option = 0;
	double bill = 0;
	double bill2 = 0;
	double bill3 = 0;
	double bill4 = 0;
	double totalbill = 0;
	double grandtotal = 0;
	double tax = .08;
	double tip = 0;
	double payment = 0;
	String order[]= new String[8];
	for(int x = 0; x <= 6; x++)
	{
	order[x] = "not selected";
	x++;
	}
	for(int y = 1; y <= 7; y++)
	{
	order[y] = "0.00";
	y++;
	}
	String ns = "    $";
	
	do
	{
	
	System.out.print("\n 1. Drink menu");
	System.out.print("\n 2. Appetizers menu");
	System.out.print("\n 3. Entree menu");
	System.out.print("\n 4. Dessert menu");
    System.out.print("\n 5. Tip options");
	System.out.print("\n 6. Finish & pay");
	System.out.print("\n Which menu would you like to go to?: ");
	Scanner uin = new Scanner(System.in);
	option = uin.nextInt();
	switch(option) 
	{
	
	case 1:{ order = drinkit(order);
	         bill = bill + Double.parseDouble(order[1]);
			 break;
	       }
	case 2:{ order = appit(order);
			 bill2 = bill2 + Double.parseDouble(order[3]);
			 break;
			}
	case 3:{ order = entit(order);
			bill3 = bill3 + Double.parseDouble(order[5]);
			break;
			}
	case 4:{ order = desit(order);
			bill4 = bill4 + Double.parseDouble(order[7]);
			break;
			}
	case 5:{ tip = tipit(option, tip);
			break;
			}
	case 6:{
			totalbill = bill + bill2 + bill3 + bill4;
			grandtotal = (totalbill * tax) + (totalbill * tip) + totalbill;
	
			payit(order, ns, grandtotal, payment);
			break;
			}
	}
	} while (option > 0 && option < 6);
	
	
	
	}// Close Main Module

public static String[] drinkit(String[] order)
{
int option = 4;
System.out.print("\n Drink Menu");
System.out.print("\n ");
System.out.print("\n 1. Water " + "\t" + "1.00" );
System.out.print("\n ");
System.out.print("\n 2. Tea " + "\t" + "1.95" );
System.out.print("\n ");
System.out.print("\n 3. Soda " + "\t" + "2.50" );
System.out.print("\n ");
System.out.print("\n 4. Unselected " + "\t" + "0.00" );

do{
System.out.print("\n what drink do you want today?");
Scanner udr = new Scanner(System.in);
option = udr.nextInt();
} while(option > 5 || option < 0);

switch (option)
{

case 1:{
    order[0] = "Water";
	order[1] = "1.00";
	break;
       }
case 2:{
    order[0] = "Tea";
	order[1] = "1.95";
	break;
       }
case 3:{
    order[0] = "Soda";
	order[1] = "2.50";
	break;
       }
case 4:{
    order[0] = "Unselected";
	order[1] = "0.00";
	break;
       }	   

}
return order;
}

public static String[] appit(String[] order)// change to Appetizers
{
int option = 4;
System.out.print("\n Appetizers Menu");
System.out.print("\n ");
System.out.print("\n 1. Mini Cheese Calzones " + "\t" + "6.99" );
System.out.print("\n ");
System.out.print("\n 2. Cheese Sticks" + "\t" + "7.99" );
System.out.print("\n ");
System.out.print("\n 3. Italian Cobb Salad " + "\t" + "9.99" );
System.out.print("\n ");
System.out.print("\n 4. Unselected " + "\t" + "0.00" );

do{
System.out.print("\n What Appetizers do you want? ");
Scanner uapp = new Scanner(System.in);
option = uapp.nextInt();
} while(option > 5 || option < 0);

switch (option)
{

case 1:{
    order[2] = "Mini Cheese Calzones";
	order[3] = "6.99";
	break;
       }
case 2:{
    order[2] = "Cheese Sticks";
	order[3] = "7.99";
	break;
       }
case 3:{
    order[2] = "Italian Cobb Salad";
	order[3] = "9.99";
	break;
       }
case 4:{
    order[2] = "Unselected";
	order[3] = "0.00";
	break;
       }	   

}
return order;
}

public static String[] entit(String[] order)// change to Entree menu
{
int option = 4;
System.out.print("\n Entree Menu");
System.out.print("\n ");
System.out.print("\n 1. Sub Sandwich " + "\t" + "8.50" );
System.out.print("\n ");
System.out.print("\n 2. Pasta " + "\t" + "10.50" );
System.out.print("\n ");
System.out.print("\n 3. Pizza " + "\t" + "16.50" );
System.out.print("\n ");
System.out.print("\n 4. Unselected " + "\t" + "0.00" );

do{
System.out.print("\n what Entree do you want today?");
Scanner uent = new Scanner(System.in);
option = uent.nextInt();
} while(option > 5 || option < 0);

switch (option)
{

case 1:{
    order[4] = "Sub Sandwich";
	order[5] = "8.50";
	break;
       }
case 2:{
    order[4] = "Pasta";
	order[5] = "10.50";
	break;
       }
case 3:{
    order[4] = "Pizza";
	order[5] = "16.50";
	break;
       }
case 4:{
    order[4] = "Unselected";
	order[5] = "0.00";
	break;
       }	   

}
return order;
}

public static String[] desit(String[] order)// change to Dessert menu
{
int option = 4;
System.out.print("\n Dessert Menu");
System.out.print("\n ");
System.out.print("\n 1. Ice Cream " + "\t" + "5.00" );
System.out.print("\n ");
System.out.print("\n 2. Chocolate Lava Cake " + "\t" + "7.00" );
System.out.print("\n ");
System.out.print("\n 3. Creme Brulee " + "\t" + "10.00" );
System.out.print("\n ");
System.out.print("\n 4. Unselected " + "\t" + "0.00" );

do{
System.out.print("\n what Dessert do you want today?");
Scanner udes = new Scanner(System.in);
option = udes.nextInt();
} while(option > 5 || option < 0);

switch (option)
{

case 1:{
    order[6] = "Ice Cream";
	order[7] = "5.00";
	break;
       }
case 2:{
    order[6] = "Chocolate Lava Cake";
	order[7] = "7.00";
	break;
       }
case 3:{
    order[6] = "Creme Brulee";
	order[7] = "10.00";
	break;
       }
case 4:{
    order[6] = "Unselected";
	order[7] = "0.00";
	break;
       }	   

}
return order;
}

public static Double tipit(int option, double tip)// tip choices
{
option = 4;
System.out.print("\n Tip amounts");
System.out.print("\n ");
System.out.print("\n 1. 10%");
System.out.print("\n ");
System.out.print("\n 2. 15%");
System.out.print("\n ");
System.out.print("\n 3. 20%");
System.out.print("\n ");
System.out.print("\n 4. 0%");

do{
System.out.print("\n How much would you like to tip?");
Scanner utip = new Scanner(System.in);
option = utip.nextInt();
} while(option > 5 || option < 0);

switch (option)
{

case 1:{
    tip = 0.1;
	break;
       }
case 2:{
    tip = 0.15;
	break;
       }
case 3:{
    tip = 0.2;
	break;
       }
case 4:{
    tip = 0;
	break;
       }	   

}
return tip;
}

public static void payit(String[] order,  String ns, double grandtotal, double payment) // change to payment menu
{
int option;
double tmp;
System.out.print("\n Thank you for your patronage");
System.out.print("\n ");
System.out.print("\n here is your ticket");
System.out.print("\n ");
System.out.print("\n Drink selected: " + order[0] + ns + order[1] );
System.out.print("\n ");
System.out.print("\n Appetizers selected: " + order[2] + ns + order[3] );
System.out.print("\n ");
System.out.print("\n Entree selected: " + order[4] + ns + order[5] );
System.out.print("\n ");
System.out.print("\n Dessert selected: " + order[6] + ns + order[7] );
System.out.print("\n ");
System.out.print("\n********************************************* ");
System.out.print("\n Grand total" + ns + grandtotal);

do{
System.out.print("\n \n Please insert money for payment");
System.out.print("\n 1. for $1 ");
System.out.print("\n 2. for $5");
System.out.print("\n 3. for $10");
System.out.print("\n 4. for $20");
System.out.print("\n 5. for $50");
System.out.print("\n 6. for $100");
System.out.print("\n Select bill type for payment: ");
Scanner upay = new Scanner(System.in);
option = upay.nextInt();

switch (option)
{

case 1:{
    payment = payment + 1;
	break;
       }
case 2:{
    payment = payment + 5;
	break;
       }
case 3:{
    payment = payment + 10;
	break;
       }
case 4:{
    payment = payment + 20;
	break;
       }	
case 5:{
    payment = payment + 50;
	break;
       }
case 6:{
    payment = payment + 100;
	break;
       }	   

}

} while(payment < grandtotal);

payment = payment - grandtotal;
String result = "Amount: \n";

if(payment >= 100)
{
tmp = (int) payment/100;
result = result + (int)tmp + " $100 bills \n";
payment = payment % 100;
}
if(payment >= 50)
{
tmp = (int) payment/50;
result = result + (int)tmp + " $50 bills \n";
payment = payment % 50;
}
if(payment >= 20)
{
tmp = (int) payment/20;
result = result + (int)tmp + " $20 bills \n";
payment = payment % 20;
}
if(payment >= 10)
{
tmp= (int) payment/10;
result = result + (int)tmp + " $10 bills \n";
payment = payment % 10;
}
if(payment >= 5)
{
tmp = (int) payment/5;
result = result + (int)tmp + " $5 bills \n";
payment = payment % 5;
}
if(payment >= 1)
{
tmp = (int) payment/1;
result = result + (int)tmp + " $1 bills \n";
payment = payment % 1;
}

payment = payment * 100;
payment = (int) payment;

if(payment >= 25)
{
tmp = (int) payment/25;
result = result + (int)tmp + " quarters \n";
payment = payment % 25;
}
if(payment >= 10)
{
tmp = (int) payment/10;
result = result + (int)tmp + " dimes \n";
payment = payment % 10;
}
if(payment >= 05)
{
tmp = (int) payment/05;
result = result + (int)tmp + " nickels \n";
payment = payment % 05;
}
if(payment >= 01) {
tmp = (int) payment / 01;
result = result + (int)tmp + " pennies \n";
payment = payment % 01;
}
System.out.println("\n " + result); 

}// close the payit module

}//end the program