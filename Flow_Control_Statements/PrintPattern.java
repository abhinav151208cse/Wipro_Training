public class PrintPattern{
public static void main(String[] args) {
int row=Integer.parseInt(args[0]);
for (int i=0;i<row;i++){
for (int j=0;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
}
}