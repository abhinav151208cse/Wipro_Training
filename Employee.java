public class Employee {
public static void main(String[] args)
{
int EmpNo[]= new int[]{1001,1002,1003,1004,1005,1006,1007};
String EmpName[]=new String[] {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
char DepartmentCode[]=new char[] {'e','c','k','r','m','e','c'};
String JoinDAte[]=new String[] {"1/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/4/2000","12/06/2006"};
String Department[]=new String[] {"R&D","PM","Acct","FrontDesk","Engg","Manufacturing","PM"};
int Basic[]= new int[]{20000,30000,10000,12000,50000,23000,29000};
int HRA[]= new int[]{8000,12000,8000,6000,20000,9000,12000};
int IT[]= new int[]{3000,9000,1000,2000,20000,4400,10000};
int n=Integer.parseInt(args[0]);
int x=-1;
for(int i=0;i<7;i++)
{
if(EmpNo[i]==n)
{
x=i;
break;
}
}
if(x==-1)
{
System.out.println("There is no employee with empid: "+n);
System.exit(0);
}
String Designation=" ";
int DA=0;
switch(DepartmentCode[x])
{
case 'e':Designation="Engineer";
DA=20000;
break;
case 'c':Designation="Consultanr";
DA=32000;
break;
case 'k':Designation="Clerk";
DA=12000;
break;
case 'r':Designation="Receptionist";
DA=15000;
break;
case 'm':Designation="Manager";
DA=40000;
break;
}
System.out.println("Emp No.    Emp Name   Department    Designation      Salary");
System.out.println(n+"       "+EmpName[x]+"     "+Department[x]+"     "+Designation+"     "+(Basic[x]+HRA[x]+DA-IT[x]));
}
}
