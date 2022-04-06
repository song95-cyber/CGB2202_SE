package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * LIst 集合
 * LIst接口继承字Collection,是可以存放重复元素且有序的集合
 * 常用实现类:
 * java.util.ArrayList:内部实用数组实现,查询性能更好
 * java.util.LinkedList:内部使用链表实现,增删性能更好,首尾增删性能更佳
 * 在对性能没有特别苛刻的情况下通常使用ArrayList即可
 */
public class ListDemo1 {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        //List<String> list = new LinkedList<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        System.out.println(list);
//        /*
//            E get (int index)
//            获取指定下标处对应的元素
//         */
//        String str = list.get(2);//获取集合中第三个元素
//        System.out.println(str);
//        for(int i = 0; i < list.size(); i++){
//            str = list.get(i);// 相当于String str = array[i]
//            System.out.println(str);
//        }
//        /*
//            E set (int index, E e)
//            将给定元素设置到指定位置上,返回值为该位置被替换的元素
//         */
//        System.out.println(list);//[one, two, three, four, five]
//        String old = list.set(1, "six");//返回值为被替换的"two"
//        System.out.println(list);//[one, six, three, four, five]
//        System.out.println(old);// two



        List<String> list1 = new ArrayList();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        System.out.println(list1);
        String str1;
        for(int i = 0; i < (list1.size() / 2) + 1; i++){
//            str1 = list1.get(i);
//            str1 = list1.set((list1.size() - i - 1),str1);
//            list1.set(i ,str1);
            list1.set(i ,list1.set((list1.size() - i - 1),list1.get(i)));
        }
        System.out.println(list1);





    }
}

