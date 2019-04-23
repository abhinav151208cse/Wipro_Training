public class LowerToUpper{
public static void main(String[] args){
char ch = 'a';
if (Character.isLowerCase(ch)) 
System.out.println(ch+"->"+Character.toUpperCase(ch));
else
System.out.println(ch+"->"+Character.toLowerCase(ch));
}
}