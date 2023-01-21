public class Main
{
  public static void main (String[]args)
  {
    //Variables

    //Integer

    int number = 5;
    int number2 = 11;

      System.out.println (number * 10);	//50
      System.out.println (number2 / number);	//2


    //float

    float myFloat = 5f;
    float myFloat2 = 11f;

      System.out.println (myFloat2 / myFloat);	//2.2

    //double

    double myDouble = 5 d;
    double myDouble2 = 11 d;

      System.out.println (myDouble2 / myDouble);	//2.2

    //char

    char myLetter = 'D';
    char myLetter2 = 65;	//ASCII

      System.out.println (myLetter);	//D
      System.out.println (myLetter2);	//A

    //String

    String myString = "Hello";
    String myString2 = "World";

      System.out.println (myString + " " + myString2);	//Hello World

    //boolean

    boolean myTrue = true;
    boolean myFalse = false;

      System.out.println (myTrue);	//true
      System.out.println (myFalse);	//false

    //final

    int myInt = 5;

      System.out.println (myInt);	//5

      myInt = 4;

      System.out.println (myInt);	//4;

    final myInt2 = 5;

      System.out.println (myInt2);	//5;

      myInt2 = 4;

      System.out.println (myInt2);	//ERROR
  }
}
