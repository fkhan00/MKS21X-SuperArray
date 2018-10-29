public class SuperArray
{
private String[] arr;
private int size;
public SuperArray()
{
  arr = new String[10];
  size = 0;
}
public SuperArray(String[] newAr, int newSize)
{
int counter = 0;
for (int i = 0; i < newAr.length; i++)
{
  if (newAr[i] != "")
  {
    counter += 1;
  }
}
size = counter;
arr = new String[newAr.length];
for (int i = 0; i < newAr.length; i++)
{
arr [i] = newAr[i];
}
}
public SuperArray(int startingCapacity)
{
if(startingCapacity < 0)
{
  throw new IllegalArgumentException("Can't have negative starting capacity");
}
{
  size = startingCapacity;
}
}
public void clear()
{
for(int i = 0; i < arr.length; i ++)
{
arr[i] = "";
size = 0;
}
}

public boolean isEmpty()
{
return size() != arr.length;
}

public int size()
{
return size;
}
public boolean add(String word)
{
if (size == arr.length)
{
  return false;
}
arr[size()] = word;
size ++;
return true;
}

public String toString()
{
  String arrayString = "[";
  for(int i=0; i<arr.length; i++){
    arrayString += arr[i] + ",";
  }
  arrayString += "]";
  return arrayString;
}

public String toStringDebug()
{
  String arrayString = "[";
  for(int i=0; i<arr.length; i++){
    if (arr[i] != null)
    {
    arrayString += arr[i] + ",";
  }
  }
  arrayString += "]";
  return arrayString;
}

public String get(int index)
{

if (index >= arr.length || index < 0)
{
  throw new IndexOutOfBoundsException();
}
return arr[index];
}
public String set(int index, String word)
{
if (index > arr.length || index < 0 || arr[index] == word)
{
throw new IndexOutOfBoundsException();
}
String power = arr[index];
arr[index] = word;
return power;
}

private void resize()
{
  String[] output = new String[arr.length * 2 + 1];
  for (int i = 0; i < arr.length; i ++)
  {
    output[i] = arr[i];
  }
  this.arr = output;
}

public boolean contains(String target)
{
  for (int i = 0; i < arr.length; i ++)
  {
    if (arr[i] != null && arr[i].equals(target))
    {
      return true;
    }
  }
  return false;
}

public int indexOf(String target)
{
  if (!contains(target))
  {
    return -1;
  }
  for (int i =0; i < arr.length; i++)
  {
    if (arr[i].equals(target))
    {
      return i;
    }
}
return -1;
}

public int lastIndexOf(String target)
{
  if (!contains(target))
  {
    return -1;
  }
  for (int i = arr.length - 1; i >= 0; i -= 1)
  {
    if (arr[i] != null && arr[i].equals(target))
    {
      return i;
    }
  }
  return -1;
}

public void add(int index, String word)
{
  if (size == arr.length)
  {
    resize();
  }
  if (index >= arr.length || index < 0)
  {
    throw new IndexOutOfBoundsException();
  }
  else
  {
  String[] result = new String[arr.length];
  result[index] = word;
  for (int i = 0; i < arr.length - 1; i++)
  {
    if (i >= index)
    {
      result[i + 1] = arr[i];
    }
    else if (i < index)
    {
      result[i] = arr[i];
    }
  }
  arr = result;
  size ++;
}
}

public String remove(int index)
{
  String word = "";
  if(index < 0 || index >= arr.length)
  {
    throw new IndexOutOfBoundsException();
  }
  else
  {
    word = arr[index];
    String[] resultant = new String[arr.length - 1];
    for (int i = 0; i < arr.length - 1; i++)
    {
      if (i == index)
      {
        i ++;
      }
      if (i > index)
      {
        resultant[i - 1] = arr[i];
      }
      if (i < index)
      {
        resultant[i] = arr[i];
      }
    }
    this.arr = resultant;
    size ++;
  }
  return word;
}
public boolean remove(String word)
{
  if (!(contains(word)))
  {
    return false;
  }
  int plob = indexOf(word);
  remove(plob);
  size -= 1;
  return true;
}
}
