public class Drivers
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
  try
  {
  System.out.println(testCase.get(0));
  System.out.println("should return awesome");
  System.out.println(testCase.get(11));
    System.out.println("should print error message or null");
}
  catch(IndexOutOfBoundsException e)
  {
    System.out.println("Index is out of bounds");
  }
  try
  {
  System.out.println("Testing set function");
  System.out.println(testCase.set(0,"UNITED"));
  System.out.println("should return awesome and below [UNITED]");
  System.out.println(testCase);
  System.out.println("should return error message");
  System.out.println(testCase.set(100, "hi"));
}
catch(IndexOutOfBoundsException e)
{
  System.out.println("Index is out of bounds");
}
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
  try
  {
  System.out.println("Testing Remove Function");
  System.out.println(testCase);
  System.out.println("should return OF");
  System.out.println(testCase.remove(2));
  System.out.println("String should now be [UNITED, STATES, OF]");
  System.out.println(testCase);
  System.out.println("should return out of bounds error");
  System.out.println(testCase.remove(-1));
}
catch (IndexOutOfBoundsException e)
{
  System.out.println("Index is out of bounds");
}
try
{
  System.out.println("Testing add function");
  System.out.println("Should return UNITED STATES SMASH OF");
  testCase.add(2, "SMASH");
  System.out.println(testCase);
  testCase.add(1, "power");
  testCase.add(2, "power");
  testCase.add(3, "power");
  testCase.add(4, "power");
  testCase.add(2, "OF");
  testCase.add(9, "power");
  System.out.println("several add calls should have created a new array with 20elements");
  System.out.println(testCase);
  testCase.remove(4);
  testCase.remove(3);
  testCase.remove(2);
  testCase.remove(1);
  testCase.remove(1);
  testCase.remove(4);
  testCase.add(2, "OF");
  testCase.remove(testCase.lastIndexOf("OF"));
  System.out.println("Should return:");
  System.out.println(testCase);
  System.out.println("Finally Testing toStringDebug \n \n");
  System.out.println(testCase.toStringDebug());
  System.out.println("should return out of bounds error");
  testCase.add(1000, "power");
}
 catch(IndexOutOfBoundsException e)
 {
   System.out.println("Index is out of bounds" );
 }
}
}
