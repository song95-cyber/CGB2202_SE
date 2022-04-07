package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 当元素本身实现了Comparable接口并定义了比较规则,但是按照该规则排序后不满足我们的排序需求时,我们也可以自定义比较规则
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("小泽老师");
        list.add("传奇");
        System.out.println(list);

        Collections.sort(list, (o1, o2) -> o2.length() - o1.length());
        System.out.println(list);
    }
}
