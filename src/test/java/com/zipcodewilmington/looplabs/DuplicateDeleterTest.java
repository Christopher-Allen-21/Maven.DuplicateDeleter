package com.zipcodewilmington.looplabs;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateDeleterTest {

    @Test
    public void countDuplicatesTest1(){

        Integer[] array = new Integer[]{3,3,2,5,3,20,3,0};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer expected = 4;
        Integer actual = dupDeleter.countDuplicates(array,3);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countDuplicatesTest2(){

        Integer[] array = new Integer[]{3,3,2,5,3,20,3,0};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer expected = 1;
        Integer actual = dupDeleter.countDuplicates(array,2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void countDuplicatesTest3(){

        Integer[] array = new Integer[]{3,3,2,5,3,20,3,0};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer expected = 0;
        Integer actual = dupDeleter.countDuplicates(array,69);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addElementToArrayTest1(){
        Integer[] array = new Integer[]{0,35,2};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer[] expected = new Integer[]{0,35,2,5};
        Integer[] actual = dupDeleter.addElementToArray(array,5);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addElementToArrayTest2(){
        Integer[] array = new Integer[]{0};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer[] expected = new Integer[]{0,69};
        Integer[] actual = dupDeleter.addElementToArray(array,69);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementFromArray1(){
        Integer[] array = new Integer[]{0,2,35,2,2,3,5};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer[] expected = new Integer[]{0,35,3,5};
        Integer[] actual = dupDeleter.removeElementFromArray(array,2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementFromArray2(){
        Integer[] array = new Integer[]{0,2,1,5};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer[] expected = new Integer[]{0,2,5};
        Integer[] actual = dupDeleter.removeElementFromArray(array,1);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementFromArray3(){
        Integer[] array = new Integer[]{0,2,1,5};
        DuplicateDeleter<Integer> dupDeleter = new IntegerDuplicateDeleter(array);

        Integer[] expected = new Integer[]{0,2,1,5};
        Integer[] actual = dupDeleter.removeElementFromArray(array,6);

        Assert.assertEquals(expected,actual);
    }

}