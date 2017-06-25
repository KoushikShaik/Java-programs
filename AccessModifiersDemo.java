public class AccessModifiersDemo {
  //default access modifier
  int defaultNumber = 0;

/*
Public Modifier
*/
  public static String PublicMethod()
  {
      return "This is a public method";
  }
/*
Private Modifier
*/
  private static String PrivateMethod()
  {
      return "This is a private method";
  }
/*
Protected Modifier
*/
  protected static String ProtectedMethod()
  {
      return "This is a protected method";
  }
  public static void main(String[] args) {
    String newLine = System.getProperty("line.separator");
    System.out.println("Message returned from Public Method : " + PublicMethod() 
    + newLine);
    System.out.println("Message returned from Private Method : " + PrivateMethod() 
    + newLine);
    System.out.println("Message returned from Protected Method : " + ProtectedMethod() 
    + newLine);
  }
}