package amosdzhn.collection.list.create;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 构造函数源码追踪
 * @author amosdzhn
 */
public class ArrayListWithCollection {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        source.add(9);
        source.add(13);

        //从这列开始追踪
        List<Integer> list = new ArrayList<>(source);
    }
}
