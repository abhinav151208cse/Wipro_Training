class SumAvg{
public static void main(String args[]){
int a[]= {10,20,30,40,50};
int sum=0;
for(int i=0;i<a.length;i++)
{
sum=sum+a[i];
}
int avg=sum/a.length;
System.out.println(sum);
System.out.println(avg);
}
}