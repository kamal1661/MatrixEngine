/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 * Entity that shows one Matrix element
 * @author Rodrigo Diaz M.
 */
public class MatrixElement {
    private int rowIndex;
    private int columnIndex;
    private Number value;
   
    /**
     * Creates empty alias of MatrixElement entity
     */    
    public MatrixElement() {}
    
     /**
     * Creates alias of Matrix entity with  2 fields:
     * @param rowIndex
     * @param columnIndex
     */
    public MatrixElement(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }
    
    /**
     * Creates alias of Matrix entity with  3 fields:
     * @param rowIndex
     * @param columnIndex
     * @param value
     */
    public MatrixElement(int rowIndex, int columnIndex, Number value) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.value = value;
    }

    /**
     * Get the result of action
     * @return as the result of action
     */
    public int getRowIndex() {
        return this.rowIndex;
    }
    /**
     * Set the result of action
     * @param rowIndex as the result of action
     */
    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    /**
     * Get the result of action
     * @return as the result of action
     */
    public int getColumnIndex() {
        return this.columnIndex;
    }

    /**
     * Set the result of action
     * @param columnIndex as the result of action
     */
    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }
    /**
     * Get the result of action
     * @return as the result of action
     */
    public Number getValue() {
        return this.value;
    }

    /**
     * Set the result of action
     * @param value as the result of action
     */
    public void setValue(Number value) {
        this.value = value;
    }   
}
    