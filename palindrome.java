import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int num,compare=0,rev=0,mod=0;
Scanner n=new Scanner(System.in);
num=n.nextInt();
compare=num;
while (num!=0)
{
mod=num%10;
rev=rev*10 + mod;
num=num/10;
}
if(compare==rev)
{
System.out.println("Number is Palindrome");
}
else
System.out.println("Number is not Palindrome");
}
}