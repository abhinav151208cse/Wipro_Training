public class Search{
public static void main(String[] args) {
int a[]={55,25,63,85,74};
int count=0;
int search=63;
int pos=0;
for (int i=0;i<a.length;i++){
if (a[i]==search){
count=1;
pos=i;
break;
}
}
if(count==1)
System.out.println("Searched no. is at position"+pos);
else
System.out.println("-1");
}
}