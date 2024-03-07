package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAllInputs() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedEyeColor = "Green";
        Boolean expectedCanSee = true;
        Character expectedMiddleInit = 'J';
        String expectedLName = "Parker";
        Boolean expectedJR = true;

        // When
        Person person = new Person(expectedName, expectedAge, expectedEyeColor, expectedCanSee, expectedMiddleInit, expectedLName, expectedJR);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualEyeColor = person.getEyeColor();
        Boolean actualCanSee = person.getCanSee();
        Character actualMiddleInit = person.getMiddleInit();
        String actualLName = person.getLName();
        Boolean actualJR = person.getJR();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedEyeColor, actualEyeColor);
        Assert.assertEquals(expectedCanSee, actualCanSee);
        Assert.assertEquals(expectedMiddleInit, actualMiddleInit);
        Assert.assertEquals(expectedLName, actualLName);
        Assert.assertEquals(expectedJR, actualJR);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor(){
        //Given
        Person person = new Person();
        String expected = "Green";

        //When
        person.setEyeColor(expected);

        //Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetCanSee(){
        //Given
        Person person = new Person();
        Boolean expected = true;

        //When
        person.setCanSee(expected);

        //Then
        Boolean actual = person.getCanSee();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMiddleInit(){
        //Given
        Person person = new Person();
        Character expected = 'J';

        //When
        person.setMiddleInit(expected);

        //Then
        Character actual = person.getMiddleInit();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLName(){
        //Given
        Person person = new Person();
        String expected = "Parker";

        //When
        person.setLName(expected);

        //Then
        String actual = person.getLName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetJR(){
        //Given
        Person person = new Person();
        Boolean expected = false;
        
        //When
        person.setJR(expected);

        //Then
        Boolean actual = person.getJR();
        Assert.assertEquals(expected, actual);
    }

}
