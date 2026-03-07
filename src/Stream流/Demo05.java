package Stream流;

import java.util.stream.Stream;

public class Demo05 {
    public static void main(String[] args) {
        //一堆零散数据：public static<T> Stream<T> of(T... values)    Stream 接口中的静态方法

        Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(s->System.out.println(s));
        System.out.println("===========");
        Stream.of("a","b","c","d","e").forEach(s->System.out.println(s));
    }
}
