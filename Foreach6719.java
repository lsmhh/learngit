package java6719.lesson04;

import java.util.*;

public class Foreach6719 {
    public static void useIterator6719(Student6719... student6719) {
        //创建Collection集合
        Collection<Student6719> tion = new ArrayList<Student6719>();
        //把学生信息存入集合中
        tion.addAll(Arrays.asList(student6719));
        //创建迭代器
        Iterator<Student6719> iter = tion.iterator();
        //进行遍历
        while (iter.hasNext()) {
            Student6719 str = iter.next();
            System.out.println(str.toString());
        }
        System.out.println("\n");
    }

    public static void useForeach6719(Student6719... student6719) {
        //创建Collection集合
        Collection<Student6719> tion = new ArrayList<Student6719>();
        //把学生信息存入集合中
        tion.addAll(Arrays.asList(student6719));
        //进行遍历
        for (Student6719 str : tion) {
            System.out.println(str.toString());
        }
        System.out.println("\n");
    }

    public static void useList6719(Student6719... student6719) {
        //创建List集合
        List<Student6719> list = new ArrayList<Student6719>();
        //把学生信息存入集合中
        list.addAll(Arrays.asList(student6719));
        //进行遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "\t" + list.get(i));
        }
        System.out.println("\n");
    }

    public static void useArray6719(Student6719... student6719s) {
        //创建Collection集合
        Collection<Student6719> tion = new ArrayList<Student6719>();
        //把学生信息存入集合中
        tion.addAll(Arrays.asList(student6719s));
        //创建student数组
        Student6719[] i = new Student6719[tion.size()];
        //调用Collection的<T> T[] toArray(T[] a)将集合转为数组
        tion.toArray(i);
        //进行遍历
        for (Student6719 student6719 : i) {
            System.out.println(student6719.toString());
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //实例化四名学生
        Student6719 s1 = new Student6719("小王", 20);
        Student6719 s2 = new Student6719("小赵", 21);
        Student6719 s3 = new Student6719("小李", 19);
        Student6719 s4 = new Student6719("小孙", 25);
        //调用函数
        useIterator6719(s1, s2, s3, s4);
        useForeach6719(s1, s2, s3, s4);
        useList6719(s1, s2, s3, s4);
        useArray6719(s1, s2, s3, s4);
    }

}
//创建学生类
class Student6719 {
    private String name;//姓名
    private int age;//年龄

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
//无参改造函数
    public Student6719() {
    }
//两个参数的构造函数
    public Student6719(String name, int age) {
        this.name = name;
        this.age = age;
    }
//重写tostring函数
    @Override
    public String toString() {
        return name + ":" + age;
    }
}
