//Sorting over user defined elements in tree set using comparable interface through compare To() method......

import java.util.TreeSet;

class Employee implements Comparable<Employee> {
 int eno;
 String name;
 int salary;

 public Employee(int eno, String name, int salary) {
  this.eno = eno;
  this.name = name;
  this.salary = salary;
 }

 @Override
 public String toString() {
  return "Employee{" +
          "eno=" + eno +
          ", name='" + name + '\'' +
          ", salary=" + salary +
          '}';
 }

 @Override
 public int compareTo(Employee o) {

  int val = new Integer(this.salary).compareTo(o.salary);
  //int val=(this.name).compareTo(o.name);
  return -val;

 }
}



 class Comparablle {
  public static void main(String[] args) {
   Employee e1=new Employee(12,"A",100);
   Employee e2=new Employee(12,"B",500);
   Employee e3=new Employee(12,"C",300);
   TreeSet<Employee> ts=new TreeSet();
   ts.add(e1);
   ts.add(e2);
   ts.add(e3);
   System.out.println(ts);
  }
}
//ascending order when return val=+ve
//o/p:[Employee{eno=12, name='A', salary=100}, Employee{eno=12, name='C', salary=300}, Employee{eno=12, name='B', salary=500}]

//descending order when return val=-ve
//[Employee{eno=12, name='B', salary=500}, Employee{eno=12, name='C', salary=300}, Employee{eno=12, name='A', salary=100}]