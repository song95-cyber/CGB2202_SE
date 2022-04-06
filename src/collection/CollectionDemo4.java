package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *集合之间的操作
 *
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("java");
        c1.add("c++");
        c1.add(".net");
        c1.add("android");

        Collection c2 = new HashSet();
        c2.add("android");
        c2.add("ios");
        System.out.println("c2:" + c2);
        c2.addAll(c1);
        c1.addAll(c2);
        System.out.println(c2);
        System.out.println(c1);
    }
}
