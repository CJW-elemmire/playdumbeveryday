package cn.itcast.day01.demo01;

/*
修饰符 返回值类型 方法名称（参数类型 参数名称，...）{
         方法体
         return 返回值；
}
修饰符：现阶段的固定写法： public static
返回值类型，也就是方法最终产生的数据结果
方法名称：小驼峰
参数类型：进入方法的数据是什么类型
参数名称：进入方法的数据对应的变量名称
PS：参数如果有多个，使用逗号进行分隔

 */

public class Demo02 {
    public static void main(String[] args) {
        //单独调用
        sum(10, 20);
        //打印调用
        System.out.println(sum(10, 20));
        //赋值调用
        int number = sum(15, 25);
        System.out.println(number);

    }

    public static int sum(int a, int b) {
        System.out.println("success");
        int result = a + b;
        return result;
    }

}
