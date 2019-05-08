class DuplicateElement{
public static void main(String args[]){
int a[]={21,25,26,28,29,27};
int a_copy[]=new int[6];
System.arraycopy(a,0,a_copy,0,a.length);
System.out.println("Orignal Array");
for(int i=0;i<a.length;i++){
System.out.print(a[i]+",");
}
System.out.println("Duplicate Array");
for(int j=0;j<a_copy.length;j++){
System.out.print(a_copy[j]+",");
}
}
}


