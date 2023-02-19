public class HelloWorld {
  private String defaultString = "Ola World!";
  private static int defaultInt = 42;

  public String hello(String str) {
    return str;
  }

  public char getFirstLetter(String str) {
    return str.charAt(0);
  }

  public char getLastLetter(String str) {
    return str.charAt(str.length() - 1);
  }

  public static void main(String[] args) {
    System.out.println("Hello!");

    HelloWorld hw = new HelloWorld();
    System.out.println(hw.defaultString);
    System.out.println(defaultInt);
    System.out.println(hw.hello("hi"));
    System.out.println(hw.getFirstLetter("hi"));
    System.out.println(hw.getLastLetter("hi"));
  }
}
