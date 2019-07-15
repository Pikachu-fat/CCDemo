package com.example.component_base;

/**
 * Created by weijianqiang
 * On 2019/7/10
 * Description:
 */
public class UserBean {
    public String name;
    public int age;
    public float height;

    public UserBean(String name,int age,float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
