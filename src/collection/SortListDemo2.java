package collection;

import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 集合排序自定义类型元素
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(15,8));
        list.add(new Point(9,7));
        list.add(new Point(5,3));
        list.add(new Point(4,6));
        System.out.println(list);
        /*
            编译不通过。原因:集合元素没有实现接口Comparable。只有实现了该接口的类
            才可以进行比较(实现接口后就必须重写方法compareTo()用于定义两个元素间的
            比较大小规则)。
            该操作对我们的代码具有侵入性，不建议这样做。
            侵入性:当我们调用一个功能时，其要求我们为其修改其他额外的代码，这就是侵入性
            它不利于程序后期的维护与扩展，应当尽量避免。
         */
//        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Point>(){
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()* o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()* o2.getY();
                return len1 - len2;
            }
        });













        //        Collections.sort(list, (o1, o2) ->
//                o1.getX() * o1.getX() + o1.getY() * o1.getY() -
//                        o2.getX() * o2.getX() - o2.getY() * o2.getY());
//        System.out.println(list);
//










        //        Collections.sort(list, new Comparator<Point>(){
//
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX() * o1.getX() + o2.getY() * o2.getY();
//                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
//                return len1 - len2;
//            }
//        });
//        System.out.println(list);
//




















//        Collections.sort(list,new Comparator<Point>(){
//
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
//                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
//                return len1 - len2;
//            }
//        });
//        System.out.println(list);












        //        Comparator<Point> c = new Comparator<Point>(){
//
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
//                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
//                return len1 - len2;
//            }
//        };
//        Collections.sort(list, c);
//        System.out.println(list);


















//        Comparator<Point> c = new Comparator<Point>() {
//
//            @Override
//            public int compare(Point o1, Point o2) {
//                int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
//                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
//                return len1 - len2;
//            }
//        };
//        Collections.sort(list,c);
//        System.out.println(list);
    }
}

