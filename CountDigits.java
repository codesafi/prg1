import java.util.*;

public class CountDigits
{
public static void main(String args[])
{
Scanner scn= new Scanner(System.in);
System.out.print("Enter number for digit count :- ");
int num=scn.nextInt();

int dig=0;
while(num != 0){
num = num/10;
dig++;
}
System.out.println(dig);
}
}