/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers.Utils;

/**
 * Utility for array operations
 * @author AlekseyKachan
 */
public class ArrayUtil {

    /**
     * Gets arrays length
     * @param array - entity to work with
     * @return integer value of amount of not null values in array
     */
    public static int getArraysLength(Object[] array) {
        int counter = 0;
        for(Object value: array) {
            if (value == null) {
                break;
            }
            
            counter++;
        }
        
        return counter;
    }
}
