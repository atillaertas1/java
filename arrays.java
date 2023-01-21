public class Main
{
  public static void main (String[]args)
  {
    //Arrays

    String[]myStringArray = new String[3];

    myStringArray[0] = "Ahmet";
    myStringArray[1] = "Mehmet";
    myStringArray[2] = "Kaan";

    System.out.println (myStringArray[1]);	//Mehmet

    int[] myIntArray = new int[3];

      myIntArray[0] = 0;
      myIntArray[1] = 1;
      myIntArray[2] = 2;

      System.out.println (myIntArray[1]);	//1

    int[] myNumberArray = { 0, 1, 2, 3, 4, 5, 6, 7 };

    System.out.println (myNumberArray[3]);	//3

  }
}
