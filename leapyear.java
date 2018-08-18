import java.util.Scanner;
class leapyear
{
public static void main(String args[])
{
int year;
Scanner n=new Scanner(System.in);
year=n.nextInt(); 
if((year%4 == 0) && (year%100!=0))
{
System.out.print("This is a Leap Year");
}
else if((year%100 == 0) && (year%400 == 0))
{
System.out.print("This is a Leap Year");
}
else if(year%400 == 0)
{
System.out.print("this is a leap year");
}
else
{
System.out.print("this is not a leap year");
}
}
}