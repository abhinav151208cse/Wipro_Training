public class PrintPrime {
public static void main(String[] args) {
for(int i=10;i<100;i++){
int count= 1;
for(int j=2;j<i/2;j++){
if(i%j==0){
count = 0;
break;
}
}
if(count==1)
System.out.print(i + " ");
}
}
}