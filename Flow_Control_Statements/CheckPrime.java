class CheckPrime{
public static void main(String arg[]){
int n=Integer.parseInt(arg[0]);
int count=0;
for(int i=2;i<=n/2;i++){
if(n%i==0)
{
System.out.println("The number is not prime");
count=1;
break;
}
}
if(count==0)
{
System.out.println("the number is prime");
}
}
}