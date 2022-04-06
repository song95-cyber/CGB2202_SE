package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历,
 * 集合提供了统一的遍历方式:迭代器模式
 * 对应的方法:
 * Iterator iterator()
 * 该方法可以获取一个用于遍历当前集合的迭代器实现类
 *
 * java.util.Iterator 迭代器接口
 * 不同的集合都提供了一个迭代器实现类用于遍历当前集合元素.迭代器接口上规定了便立即和的相关方法,
 * 使用迭代器遍历集合的步骤遵循:问->取->删的步骤进行,其中删除不是不要操作
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);
        Iterator it = c.iterator();
        while(it.hasNext()){
            String e = (String)it.next();
            System.out.println(e);
            if("#".equals(e)){
                /*
                使用迭代器遍历集合元素的过程中不要通过几何的add,remove这样的操作增删元素,否则迭代器会抛出异常
                java.util.ConcurrentModificationException
                 */
               // c.remove(e);
                it.remove();
            }
        }
        System.out.println(c);
    }
}
