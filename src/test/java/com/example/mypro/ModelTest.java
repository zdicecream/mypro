package com.example.mypro;

import com.example.mypro.dao.entity.User;

class Apple{
    static String color = null;

}

public class ModelTest {
    /**
     * 避免if-else
     * 使用 卫语句，策略模式，状态模式
     */
    public void test1(){
        //"".equal   防止出现NPE
        if("green".equals(Apple.color)){
            System.out.println("this is green");
            return;
        }
        if("red".equals(Apple.color)){
            System.out.println("this is red");
            return;
        }
        if("orange".equals(Apple.color)){
            System.out.println("this is orange");
            return;
        }

    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.toString());
    }
}
