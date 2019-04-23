class AlphaDigitCharecter{
public static void main (String[] args) {
char item='9';
if(item>=48 && item<=57)
System.out.print("Digit");
else if((item>='a' && item<='z')||(item>='A' && item<='Z'))
System.out.print("Alphabet");
else
System.out.print("special character");
}
}