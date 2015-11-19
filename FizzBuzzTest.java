/* James Easton and Josh Smith
*/
class FizzBuzzTest {
  //FizzBuzz test class
  //A program to test the functionality of our FizzBuzz class
  public static void fizzNumberTest() {
  	//n = 0
    if (FizzBuzz.fizzNumber(0).equals("fizzbuzz")) {
      System.out.println("Success: 0 => fizzbuzz");
    }
    else {
      System.out.println("Test Failed, n=0.");
    }
  	//n = 1
    if (FizzBuzz.fizzNumber(1).equals("1")) {
      System.out.println("Success: 1 => 1");
    }
    else {
      System.out.println("Test Failed, n=1.");
    }
  	//n = 3
    if (FizzBuzz.fizzNumber(3).equals("fizz")) {
      System.out.println("Success: 3 => fizz");
    }
    else {
      System.out.println("Test Failed, n=3.");
    }
  	//n = 5
    if (FizzBuzz.fizzNumber(5).equals("buzz")) {
      System.out.println("Success: 5 => buzz");
    }
    else {
      System.out.println("Test Failed, n=5.");
    }
  	//n = 15
    if (FizzBuzz.fizzNumber(15).equals("fizzbuzz")) {
      System.out.println("Success: 15 => fizzbuzz");
    }
    else {
      System.out.println("Test Failed, n=15.");
    }
  	//n = "String"

  	//n = -9

  	//n = -10

  	//n = -15

  	//n = 101

  }

  public static void fizzListTest() {
  	//start = 1 end = 5

  	//start = 12 end = 16

    // start = -2 end = 2

    //start = 10 end = 5
  }
  
  public static void main(String[] args) {
    //Program logic goes herels
    fizzNumberTest();

  }
}