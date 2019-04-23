public class SumOfDigits{
public static void main(String[] args){
int number = Integer.parseInt(args[0]);
int sum=0;
while(number != 0){
sum+=number%10;
number=number/10;
}
System.out.println(sum);
}
}