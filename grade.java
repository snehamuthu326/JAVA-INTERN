import java.util.*;
class grade
{
public static void main(String args [])
{
int x, total =0, avg, n;
Scanner in = new Scanner(System.in);
System.out.print("Total number of Subjects(for 100): ");
n = in.nextInt();
int a[];
a = new int [10]; 
for(int i = 1; i <= n; i++)
{
System.out.print("Subject " + i +" ");
a[i] =  in.nextInt();
}
for(int i=0;i<=n;i++)
{
total = total + a[i];
}
System.out.println("**********************************************");
System.out.println("Your Total Mark is "+total);
avg = total/n;
System.out.println("Your Average Mark is "+avg);
if(100 >= avg && avg > 90)
{
System.out.println("Your Grade is 'A'");
}
else if(90 >= avg && avg  > 80)
{
System.out.println("Your Grade is 'B'");
}
if(80 >= avg && avg  > 65)
{
System.out.println("Your Grade is 'C'");
}
if(65 >= avg && avg  > 50)
{
System.out.println("Your Grade is 'D'");
}
if(50 >= avg && avg  >= 35)
{
System.out.println("Your Grade is 'E'");
}
if(35 > avg)
{
System.out.println("Your Grade is 'F'");
}
System.out.println("**********************************************");
}
}

