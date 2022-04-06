package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start, int end)
 * 获取指定范围内的子集
 */
public class ListDemo3 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        System.out.println(list);
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);

        for(int i = 0; i < subList.size(); i++){
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(subList);
        /*
        对子集的操作就是对原集合的操作
         */
        System.out.println(list);

        //删除集合中的2- 8这些元素
        list.subList(2,9).clear();
        System.out.println(list);
    }
}
