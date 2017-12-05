/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers.Utils;

/**
 *
 * @author AlekseyKachan
 */
public class ArrayUtil {
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
