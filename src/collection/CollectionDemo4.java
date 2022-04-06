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

        Collection c3 = new ArrayList();
        c3.add("ios");
        c3.add("java");
        //c3.add("php");

        Collection c4 = new ArrayList();
        c4.add(c3);
        System.out.println(c3);
        boolean a = c1.containsAll(c3);
        System.out.println(a);
        int ab = c1.size();
        System.out.println(ab);
        boolean bc = c2.isEmpty();
        System.out.println(bc);

        System.out.println(c2);
        System.out.println(c3);
        c2.retainAll(c3);
        System.out.println(c2);
        System.out.println(c3);
        c3.retainAll(c4);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c3.size());
        System.out.println(c4.size());
        System.out.println(c4);
        System.out.println(c1);
        System.out.println(c2);
        c1.removeAll(c2);
        System.out.println(c1);
    }
}



