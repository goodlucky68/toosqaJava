/*
 * 日期：20210606
 * 功能：复习arraylist的CRUD操作: 使用迭代器
 *  * 
 * 来源：https://www.toolsqa.com/java/data-structures-arraylist/
 * 
 */

package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTesta {
    public static void printList(List<String> words) {
    	
    	//List 的父接口有Iterable,所以下面这个语句成立
    	Iterator<String> iterator = words.iterator();
    	 
    	   while(iterator.hasNext()) {
    	     String word = iterator.next();
    	     System.out.print(word + " ");
    	   }
    	 
    	   System.out.println();
    }

    public static void main(String []args) {
        List<String> words = new ArrayList<String>();
        // append
        words.add("school");
      //To access an element via index
        printList(words);

        words.add(0, "at");
        System.out.println("> Insert via index");
        printList(words);

        words.set(1, "work");
        System.out.println("> Update via index");
        printList(words);

        words.remove(0);
        System.out.println("> Remove via index");
        printList(words);

    }
}

