public class HelloWorld {
  private String defaultString = "Ola World!";
  private static int defaultInt = 42;
  private static String[] daysOfWeek = {
    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
  };
  private static String[][] ticTacToeBoard = {
    {"O", "X", "X"},
    {"X", "O", "O"},
    {"X", "O", "O"}
  };

  public String hello(String str) {
    return str;
  }

  public char getFirstLetter(String str) {
    return str.charAt(0);
  }

  public char getLastLetter(String str) {
    return str.charAt(str.length() - 1);
  }

  public static int getLength(String... strs) {
    return strs.length;
  }

  public static void main(String[] args) {
    System.out.println("Hello!");

    HelloWorld hw = new HelloWorld();
    System.out.println(hw.defaultString);
    System.out.println(defaultInt);
    System.out.println(hw.hello("hi"));
    System.out.println(hw.getFirstLetter("hi"));
    System.out.println(hw.getLastLetter("hi"));
    System.out.println(daysOfWeek.length);
    System.out.println(daysOfWeek[3]);
    System.out.println(ticTacToeBoard[2][2]);
    System.out.println(getLength("hi", "hello", "ola"));
  }
}
