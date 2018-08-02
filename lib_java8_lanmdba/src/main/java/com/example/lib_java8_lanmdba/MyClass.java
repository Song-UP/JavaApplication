package com.example.lib_java8_lanmdba;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MyClass {

    private  static MyClass tester = new MyClass();
    public static void main(String[] args){

        //----------1.基本使用
        //类型声明
        MathOperation addOperation01 = (int a, int b) -> a + b;
        //不用声明类型
        MathOperation addOperation02 = (a, b) -> a + b;
        //带有括号的返回值
        MathOperation addOperation03= (a, b) -> {return a + b;};
        //不带有括号，但是有声明类型的返回值
        MathOperation addOperation04= (a, b) -> {return a + b;};

        System.out.println("10 + 5 = " + tester.operate(10, 5, addOperation01));
        System.out.println("10 - 5 = " + tester.operate(10, 5, addOperation02));
        System.out.println("10 x 5 = " + tester.operate(10, 5, addOperation03));
        System.out.println("10 / 5 = " + tester.operate(10, 5, addOperation04));

        int c = 0;
        MathOperation mathOperation05 = (a,b)->a+b+c;
        System.out.println("10 / 5 = " + mathOperation05.operation(1, 2));
//        c =5;

//------------2.foreach,   :: 的使用
        //方法的引用通过方法名，只想另一个另一个方法，使用：
        Car car = Car.create(Car::new);
        //foreach 循环 ,静态方法的使用
        List<Car> cars = Arrays.asList(car);
        cars.forEach(Car::collide);
        //特定对方方法的应用
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );

        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i<20; i++){
            strList.add("aaa"+i);
        }
        strList.forEach(System.out::println);


        //------------3.函数式编程
        List<Integer> a = Arrays.asList(1,2,3,4,5,7,8);
        System.out.println(" n->n%2==0");
        eval(a, n->n%2==0);
        System.out.println(" n ");
        eval(a, n->true);



    }


    public static void eval(List<Integer> array, Predicate<Integer> predicate){
        for (Integer a : array){
            if (predicate.test(a)){
                System.out.print(a+"\t");
            }
        }

        System.out.print("\n");


    }

    public int  operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);

    }



    public interface MathOperation{
        int operation(int a, int b);
    }
}
