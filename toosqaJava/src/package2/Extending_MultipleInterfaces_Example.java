/*
 * 日期：20210606
 * 功能：
 * 来源：https://www.tutorialspoint.com/can-an-interface-in-java-extend-multiple-interfaces
 * 
 */

package package2;

import java.util.Scanner;

interface ArithmeticCalculations{
	   public abstract int addition(int a, int b);
	   public abstract int subtraction(int a, int b);
	}
interface MathCalculations {
	   public abstract double squareRoot(int a);
	   public abstract double powerOf(int a, int b);
	}
interface MyInterface extends MathCalculations, ArithmeticCalculations {
	
	//写成void displayResults()也可以
	     void displayResults();
	}
public class Extending_MultipleInterfaces_Example implements MyInterface {
	   public int addition(int a, int b) {
	      return a+b;
	   }
	   public int subtraction(int a, int b) {
	      return a-b;
	   }
	   public double squareRoot(int a) {
	      return Math.sqrt(a);
	   }
	   public double powerOf(int a, int b) {
	      return Math.pow(a, b);
	   }
	   //接口里的方法都必须实现，这里实现了displayResults()。除非类定义了抽象方法
	   public void displayResults(){
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of a: ");
	      int a = sc.nextInt();
	      System.out.println("Enter the value of b: ");
	      int b = sc.nextInt();
	      Extending_MultipleInterfaces_Example obj = new Extending_MultipleInterfaces_Example();
	      System.out.println("Result of addition: "+obj.addition(a, b));
	      System.out.println("Result of subtraction: "+obj.subtraction(a, b));
	      System.out.println("Square root of "+a+" is: "+obj.squareRoot(a));
	      System.out.println(a+"^"+b+" value is: "+obj.powerOf(a, b));
	   }
public static void main(String args[]){
	      new Extending_MultipleInterfaces_Example().displayResults();
	   }
	}

