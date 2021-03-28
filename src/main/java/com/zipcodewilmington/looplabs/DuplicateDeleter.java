package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/25/18.
 */
public class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] inputArray;

    public DuplicateDeleter(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public T[] removeDuplicates(int maxNumberOfDuplications){
        T[] returnArray = Arrays.copyOf(inputArray,inputArray.length);

        for(int i=0;i< returnArray.length;i++){
            returnArray[i] = inputArray[i];
        }

        for(int i=0;i<inputArray.length;i++){
            if(countDuplicates(inputArray,inputArray[i]) >= maxNumberOfDuplications){
                returnArray = removeElementFromArray(returnArray,inputArray[i]);
            }
        }

        return returnArray;
    }

    public T[] removeDuplicatesExactly(int exactNumberOfDuplications){
        T[] returnArray = Arrays.copyOf(inputArray,inputArray.length);

        for(int i=0;i< returnArray.length;i++){
            returnArray[i] = inputArray[i];
        }

        for(int i=0;i<inputArray.length;i++){
            if(countDuplicates(inputArray,inputArray[i]) == exactNumberOfDuplications){
                returnArray = removeElementFromArray(returnArray,inputArray[i]);
            }
        }

        return returnArray;
    }

    public Integer countDuplicates(T[] array, T value){
        Integer count = 0;

        for(int i=0;i<array.length;i++){
            if(array[i].equals(value)){
                count++;
            }
        }
        return count;
    }

    public T[] addElementToArray(T[] array, T value){
        T[] returnArray = Arrays.copyOf(array,array.length+1);

        for(int i=0;i<array.length;i++){
            returnArray[i] = array[i];
        }

        returnArray[returnArray.length-1] = value;
        return returnArray;
    }

    public T[] removeElementFromArray(T[] array, T value){
        T[] returnArray = Arrays.copyOf(array,array.length-countDuplicates(array,value));
        int count = 0;

        for(int i=0;i<array.length;i++){
            if(!array[i].equals(value)){
                returnArray[count] = array[i];
                count++;
            }
        }
        return returnArray;
    }
}
