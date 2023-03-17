//Like comparable comparator is also an interface which is widely used for sorting purpose....
//Steps to use comparator
//01.prepare a user defined class as an implementation class to java.util comparator interface and provide implementat-
//ion to compare() method
//prepare tree set  object and pass comparator implementation  to tree set  be passing reference variable ....String
//buffer do implement comparable interface so default compare to function is not available to tree set

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<StringBuffer> {


 @Override
 public int compare(StringBuffer o1, StringBuffer o2) {
  int l1=o1.length();
  int l2=o2.length();
  return l2-l1;
 }
}
class Tesst{
 public static void main(String[] args) {
  StringBuffer sb1=new StringBuffer("aaaa");
  StringBuffer sb2=new StringBuffer("ccccccc");
  StringBuffer sb3=new StringBuffer("b");
  MyComparator mc=new MyComparator();
  TreeSet<StringBuffer> ts=new TreeSet(mc);

  ts.add(sb1);
  ts.add(sb2);
  ts.add(sb3);
  System.out.println(ts);

 }
}
