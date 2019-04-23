public class MaxMin{
public static void main(String[] args){
int a[]={50,56,85,98,74,25,32,14,56,96,25,55};
int min=a[0];
int max=a[0];
for (int i=1;i<a.length;i++){
if (a[i] > max) 
{
max = a[i];
}
if (a[i] < min) 
{
min = a[i];
}
}
System.out.println("Maximum "+max);
System.out.println("Minimum "+min);
}
}