public class store extends VideoStore{
public static void main(String args[])
{
VideoStore o=new VideoStore();
//VideoStore o1=new VideoStore();
Arrays.fill(o.flag, true);
//VideoStore o2=new VideoStore();
o.addVideo("The Matrix");
o.addVideo("Godfather II");
o.addVideo("Star War Episode IV: A New Hope");
o.receiveRating(0, 4);
o.receiveRating(1, 3);
o.receiveRating(2, 5);
o.checkOut("The Matrix");
o.checkOut("Godfather II");
o.checkOut("Star War Episode IV: A New Hope");
o.returnVideo("The Matrix");
o.returnVideo("Godfather II");
o.returnVideo("Star War Episode IV: A New Hope");
o.checkOut("Godfather II");
o.listInventory();
}
}