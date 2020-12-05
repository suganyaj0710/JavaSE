package com.javaSE8.Exceptions.custom;

public class test1 {
    private String name;
    private int age;
    private String mobile;
    private String address;

    public test1() {
        System.out.println("called");
    }

    public test1(String name, int age, String mobile, String address) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "test1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
