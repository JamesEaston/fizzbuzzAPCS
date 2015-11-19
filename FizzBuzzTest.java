/* James Easton and Josh Smith
*/
class FizzBuzzTest {
  //FizzBuzz test class
  //A program to test the functionality of our FizzBuzz class
  public static void fizzNumberTest() {
  	//n = 0
    if (FizzBuzz.fizzNumber(0).equals("fizzbuzz")) {
      System.out.println("Success: 0=> fizzbuzz");
    }
    else {
      System.out.println("Test Failed, n=0.");
    }
  	//n = 1

  	//n = 3

  	//n = 5

  	//n = 15

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