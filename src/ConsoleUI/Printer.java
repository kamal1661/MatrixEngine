/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

import Data.Matrix;

/**
 *
 * @author AlekseyKachan
 */
public class Printer {
    public static void printMatrix(Matrix matrix) {
        System.out.println("Rows: " + matrix.getRowCount());
        System.out.println("Columns: " + matrix.getColumnCount());
        for(int rowIndex = 0; rowIndex < matrix.getRowCount(); rowIndex++) {
            for(int columnIndex = 0; columnIndex < matrix.getColumnCount(); columnIndex++) {
                System.out.print(matrix.getElement(rowIndex, columnIndex).getValue() + " ");
            }
            System.out.println();
        }
    }
}
