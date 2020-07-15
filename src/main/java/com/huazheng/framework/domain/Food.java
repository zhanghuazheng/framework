package com.huazheng.framework.domain;

/**
 * @Classname Food
 * @Description TODO
 * @Date 2020/7/15 13:51
 * @Created by zhanghuazheng
 */
public class Food {
    private String name;
    private String color;

//    public Food(){
//
//    }
    public Food(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
