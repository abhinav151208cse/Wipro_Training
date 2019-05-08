class Box
{
double width;
double height;
double depth;
Box()
{
System.out.println("Constructing Box");
width = 100;
height = 100;
depth = 100;
}
double volume()
{
return width * height * depth;
}
}
class BoxDemo
{
public static void main(String args[])
{
Box mybox1 = new Box();
Box mybox2 = new Box();
double vol;
vol = mybox1.volume();
System.out.println("Volume of the first box is " + vol);
vol = mybox2.volume();
System.out.println("Volume of the second box is " + vol);
}
}