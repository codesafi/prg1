import java.util.*;
public class InverseNumber
{
public static void main(String args[])
{
 Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();

 int inv = 0;
 int op = 1;   //original place 
 while(n != 0)
{
  int od = n % 10;   // od = original digit
  int id = op;
		// id  inverted digit   ip inverted place
  int ip = od;
//make change to inv using ip and id
  inv = inv + id * (int)Math.pow(10, ip - 1);
  n= n/10;
 op++;
}

 System.out.println("inverse of your number");
 System.out.println(inv);
}

}