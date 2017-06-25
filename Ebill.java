import java.util.*;
class Ebill
{
public static void main (String args[])
{
customerdata ob = new customerdata();
ob.Getdata();
ob.Calc();
ob.Display();

}
}

class customerdata
{
Scanner in = new Scanner (System.in);
Scanner ins = new Scanner (System.in);
String cname;
double units,tbill=1;

void Getdata()
{
System.out.print ("\n\t Enter customer name = ");
cname = ins.nextLine();
System.out.print ("\n\t Enter total consumed units = ");
units = in.nextDouble();
}

void Calc()
{
if (units>=0&& units <=50)
tbill=(0.75*units)+10;
else if (units>=51 && units<=100)
tbill=((0.75*units)+10)+((0.95*units)+20);
else if (units>=101 && units<=150)
	tbill=((0.75*units)+10)+((0.95*units)+20)+((1.25*units)+30);
	else if (units>=151 && units<=200)
		tbill=((0.75*units)+10)+((0.95*units)+20)+((1.25*units)+30)+((2.45*units)+40);

	else if(units>200)
tbill=((0.75*units)+10)+((0.95*units)+20)+((1.25*units)+30)+((2.45*units)+40)+((3*units)+50);
}

void Display()
{
System.out.println ("\n\t Customer name = "+cname);
System.out.println ("\n\t Total units = "+units);
System.out.println ("\n\t Total bill =" +tbill+"Rs");
}
}