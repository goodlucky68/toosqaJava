/*
 * 日期：20210606
 * 功能：复习arraylist的CRUD操作
 *  * 
 * 来源：https://www.toolsqa.com/java/data-structures-arraylist/
 * 
 */

package package1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void printList(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
        	//To access an element via index
            System.out.println("Words[" + i + "]: " + words.get(i));
        }
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
