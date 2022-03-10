import java.util.Arrays;

public class week3CodingAssignment {

  public static void main(String[] args) {
   
    // Step 1

    // 70 was added to make sure my subtraction was dynamic for any length array
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 70};


    // Step 1, a + b
    int lengthOfArray = ages.length;
    int diff = Math.abs(ages[lengthOfArray - lengthOfArray] - ages[lengthOfArray - 1]);
    System.out.println("The difference between the last and first element in ages[] is: " + diff);

    // Step 1, c
    int total = 0;
    for (int i = 0; i < ages.length; i++) {
      total += ages[i];
    }
    int averageAge = total / ages.length;
    System.out.println("The average age is: " + averageAge);


    // --------------------------------------------------------
    // Step 2

    // Step 2, a
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    int sum = 0;
    for (int i = 0; i < names.length; i++) {
      sum += names[i].length();
    }
    int averageNumberOfLetters = sum / names.length;
    System.out.println("The average number of letters per name is: " + averageNumberOfLetters);

    // Step 2, b
    String concatenation = "";
    for (int i = 0; i < names.length; i++) {
      concatenation += names[i] + " ";
    }
    System.out.println(concatenation);


    // --------------------------------------------------------
    // Step 3

    System.out.println("Use array[array.length - 1] to access the last element of an array.");


    // --------------------------------------------------------
    // Step 4

    System.out.println("Use array[0] to access the first element of an array.");


    // --------------------------------------------------------
    // Step 5

    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }


    // --------------------------------------------------------
    // Step 6

    int sumOfNameLengths = 0;
    for (int i = 0; i < nameLengths.length; i++) {
      sumOfNameLengths += nameLengths[i];
    }

    System.out.println("The sum of all lengths in nameLengths[] is: " + sumOfNameLengths);


    // --------------------------------------------------------
    // Step 7

    System.out.println(concatenateWord("Hello", 5));


    // --------------------------------------------------------
    // Step 8

    System.out.println(getFullName("Lyndsay", "Wilkie"));


    // --------------------------------------------------------
    // Step 9

    System.out.print("The sum of the ages in ages[] is greater than 100, true or false? ");
    System.out.println(checkIfSumIsGreaterThan100(ages));


    // --------------------------------------------------------
    // Step 10

    double[] doubleArray1 = {11.23, 13.45, 34.1, 77.35};
    System.out.print("The average of the numbers in doubleArray[] is: ");
    System.out.println(getAverage(doubleArray1));


    // --------------------------------------------------------
    // Step 11

    double[] doubleArray2 = {2.3, 17.1, 99.99, 29.065};
    System.out.print(
        "The average of doubleArray1[] is greater than the average of doubleArray2[], true or false? ");
    System.out.println(isFirstAverageGreater(doubleArray1, doubleArray2));


    // --------------------------------------------------------
    // Step 12
    System.out.print("It is hot outside and I have more than $10.50 in my pocket, true or false? ");
    System.out.println(willBuyDrink(false, 14.75));


    // --------------------------------------------------------
    // Step 13
   // The problem I'm choosing is, Do I get to attend the concert? ifSaturday and haveRide return true
    //AND I have $20.00 then I can attend the concert. This is the only way.
    System.out.print("I can attend the concert, true or false? ");
    System.out.println(attendConcert(false, false, 50.00));

  }

  // --------------------------------------------------------
  // Step 7
  public static String concatenateWord(String word, int n) {
    String concatenatedWord = "";
    for (int i = 0; i < n; i++) {
      concatenatedWord += word;
    }
    return "Hello concatenated 5 times is: " + concatenatedWord;
  }


  // --------------------------------------------------------
  // Step 8
  public static String getFullName(String firstName, String lastName) {
    return "The method getFullName() returns: " + firstName + " " + lastName;
  }


  // --------------------------------------------------------
  // Step 9
  public static boolean checkIfSumIsGreaterThan100(int[] ages) {
    return Arrays.stream(ages).sum() > 100;

  }


  // --------------------------------------------------------
  // Step 10
  public static double getAverage(double[] doubleArray1) {
    double sum = 0;
    for (int i = 0; i < doubleArray1.length; i++) {
      sum += doubleArray1[i];
    }
    double averageOfDoubleArray = sum / doubleArray1.length;
    return averageOfDoubleArray;
  }


  // --------------------------------------------------------
  // Step 11
  public static boolean isFirstAverageGreater(double[] doubleArray1, double[] doubleArray2) {
    return getAverage(doubleArray1) > getAverage(doubleArray2);
  }


  // --------------------------------------------------------
  // Step 12
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside == true && moneyInPocket > 10.50) {
      return true;
    }
    return false;

  }

  // --------------------------------------------------------
  // Step 13
    public static boolean attendConcert(boolean isSaturday, boolean haveRide, double money) {
      if (isSaturday && haveRide && money > 20.00) {
        return true;
      }
      return false;
    }
      
    
  
  




  }


