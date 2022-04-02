package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        System.out.println(c);

        Point p = new Point(1,2);
        System.out.println("p:" + p);
        /*
        boolean contains(object o)
        判断当前集合是否包含给定元素,判断依据是钙元素是否与稽核现有原色存在equals方法比较为true的情况,存在则认为包含
         */
        boolean contains = c.contains(p);
        System.out.println("包含:" + contains);

        /*
        删除元素也是删除与给定元素equals比较为true的元素
         */
        c.remove(p);
        System.out.println(c);
    }
}
