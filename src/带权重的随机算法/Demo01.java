package 带权重的随机算法;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader("src\\name.txt"));
        String line;
        while((line=br.readLine())!=null){
            String[] arr = line.split("-");
            Student stu = new Student(arr[0], Integer.parseInt(arr[2]), arr[1], Double.parseDouble(arr[3]));
            list.add(stu);
        }
        br.close();


        if (list.isEmpty()) {
            System.out.println("未读取到任何学生数据！");
            return;
        }

        //2、计算权重的总和
        double totalWeight=0;
        for (Student stu : list) {
            totalWeight = totalWeight + stu.getWeight();
        }

        // 新增：校验权重和为0，避免除以0错误
        if (totalWeight <= 0) {
            System.out.println("权重总和不能为0或负数！");
            return;
        }

        //3、计算每一个人的实际占比
        double[] arr=new double[list.size()];
        int index=0;
        for (Student stu : list) {
            arr[index] = stu.getWeight() / totalWeight;
            index++;
        }

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i-1];
        }

        // 生成随机数
        double number = Math.random();

        int result = Arrays.binarySearch(arr, number);

        if (result < 0) {
            result = -result - 1;
        }

        result = Math.min(result, list.size() - 1);
        result = Math.max(result, 0);

        Student stu = list.get(result);
        System.out.println("随机选中的学生：" + stu);
        double w = stu.getWeight();
        System.out.println("该学生权重：" + w);
        System.out.println("所有学生列表：" + list);
    }
}