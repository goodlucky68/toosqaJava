/*
 * 日期：20210606
 * 功能：How to extend Interfaces in Java
 * An interface extends another interface like a class implements an interface in interface inheritance.
 *  * 
 * 来源：https://www.tutorialspoint.com/how-to-extend-interfaces-in-java
 * 
 */

package package1;

interface A {
	   void funcA();
	}
//An interface extends another interface like a class implements an interface in interface inheritance.
//下面interface B extends A，增加了方法void funcB()。一个类implement 接口时，也可以定义（增加）自己的方法
//
interface B extends A {
	   void funcB();
	}
class C implements B {
	   public void funcA() {
	      System.out.println("This is funcA");
	   }
	   public void funcB() {
	      System.out.println("This is funcB");
	   }
	}
public class ExtendInterface {
	   public static void main(String args[]) {
	      C obj = new C();
	      obj.funcA();
	      obj.funcB();
	   }
	}
