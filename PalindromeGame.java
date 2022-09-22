import java.util.Scanner;
public class PalindromeGame
{
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("George says:");
int n = in.nextInt();
int sum = 0, r;
int temp = n;

if(n>-1)
{
while(n>0)
{
r = n % 10;
sum = (sum*10)+r;
n = n/10;
}
System.out.println("Tintin says:");
if(temp==sum)
System.out.println("Palindrome");
else
System.out.println("Not a Palindrome");
}
else
{
System.out.println("Invalid Input");
}
}
}
