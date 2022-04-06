package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5之后,推出了一个新的特性
 * 增强型for循环,也称为新循环,是可以使用相同的语法遍历集合或数组
 * 语法:
 * for(元素类型 变量名 :集合或数组){
 *      ...
 * }
 *
 */
public class NewForDemo {
    public static void main(String[] args){
        String[] array = {"one", "two", "three", "four", "five"};
        for(int i = 0; i < array.length; i++){
            String e = array[i];
            System.out.print(" " +  e);
        }
        System.out.println();
        for(String e : array ){
            System.out.print(" " + e);
        }
        System.out.println();
        for(String f : array){
            System.out.print(" " + f);
        }
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for(Object o : c){
            String oo = (String) o;
            System.out.println(oo);
        }


        Collection<String> d = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        //使用新循环遍历时,如果集合指定了泛型,那么接受元素时可以直接用对应的类型接收元素.
        for(String s : d){
            System.out.print(s);
            //新循环遍历集合会改回迭代器遍历
            //迭代器 也支持泛型,指定是要与其遍历的集合指定的泛型一致
            Iterator<String> e = c.iterator();
            while(e.hasNext()){
                String str = e.next();
                System.out.println(str);
            }
        }















    }
}
