package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    private String eyeColor;
    private boolean canSee;
    private char middleInit;
    private String lName;
    private boolean jr;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String eyeColor, boolean canSee, char middleInit, String lName, boolean jr) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.canSee = canSee;
        this.middleInit = middleInit;
        this.lName = lName;
        this.jr = jr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {

        return age;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
}
