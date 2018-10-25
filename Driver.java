public class Driver
{
public static void main(String[] args)
{
  System.out.println("**********************Phase 1*******************");
  SuperArray testCase = new SuperArray();
  System.out.println(testCase.isEmpty());
  System.out.println("Testing for add function");
  testCase.add("awesome");
  System.out.print("should print true");
  System.out.println(testCase);
  System.out.println("should print [awesome]");
  System.out.println("Testing get function");
  System.out.println(testCase.get(1));
  System.out.println("should print error message or null");
  System.out.println(testCase.get(0));
  System.out.println("should return awesome");
  System.out.println("Testing set function");
  System.out.println("should return error message and null");
  System.out.println(testCase.set(100, "hi"));
  System.out.println(testCase.set(0,"UNITED"));
  System.out.println("should return awesome and below [UNITED]");
  System.out.println(testCase);
  System.out.println("*****************Phase 3**********");
  testCase.add("STATES");
  testCase.add("OF");
  testCase.add("OF");
  System.out.println("added elements to array");
  System.out.println(testCase);
  System.out.println("Testing contains function");
  System.out.println("should return true");
  System.out.println(testCase.contains("OF"));
  System.out.println("should return false");
  System.out.println(testCase.contains("neither"));
  System.out.println("Testing indexOf function");
  System.out.println("should return 2");
  System.out.println(testCase.indexOf("OF"));
  System.out.println("Testing lastIndexOf function");
  System.out.println("should return 3");
  System.out.println(testCase.lastIndexOf("OF"));
  System.out.println("should return -1 or an equivalent");
  System.out.println(testCase.indexOf("Where"));
  System.out.println("Testing Remove Function");
  System.out.println(testCase);
  System.out.println("should return OF");
  System.out.println(testCase.remove(2));
  System.out.println("String should now be [UNITED, STATES, OF]");
  System.out.println(testCase);
  System.out.println("should return out of bounds error");
  System.out.println(testCase.remove(-1));
  System.out.println("Testing add function");
  System.out.println("Should return UNITED STATES SMASH OF");
  testCase.add(2, "SMASH");
  System.out.println(testCase);






}
}
