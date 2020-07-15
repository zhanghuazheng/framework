package com.huazheng.framework.domain;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/7/15 14:17
 * @Created by zhanghuazheng
 */
public class User {
    private Cat cat;
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
