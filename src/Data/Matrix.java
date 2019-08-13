/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 * Entity that represents the Matrix
 * @author Rodrigo Diaz M.
 * @author AlekseyKachan
 */
public class Matrix {
    /*
     * The amount of rows in the matrix
     */
    private int rowCount;
    
    /*
     * The amount of columns in the matrix
     */
    private int columnCount;
    
    /*
     * List of the elements of the matrix
     */
    private MatrixElement[][] elements;
    
    /**
     * Creates empty alias of Matrix entity
     */
    public Matrix() {}
    
    /**
     * Creates alias of Matrix entity with 2 fields:
     * @param rowCount
     * @param columnCount
     */
    public Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.elements = new MatrixElement[rowCount][columnCount];
    }
    
    /**
     * Creates alias of Matrix entity with 3 fields:
     * @param rowCount
     * @param columnCount
     * @param elements
     */
    public Matrix(int rowCount, int columnCount, MatrixElement[][] elements) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.elements = elements;
    }
    
    /**
     * Get the amount of rows in matrix
     * @return the amount of rows in matrix
     */
    public int getRowCount() {
        return this.rowCount;    
    }
    
    /**
     * Set the amount of rows in matrix
     * @param rowCount the amount of rows in matrix
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    /**
     * Get the amount of columns in matrix
     * @return the amount of columns in matrix
     */
    public int getColumnCount() {
        return this.columnCount;
    }
    
    /**
     * Set the amount of columns in matrix
     * @param columnCount the amount of columns in matrix
     */
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    /**
     * Get the list of the elements of the matrix
     * @return the list of the elements of the matrix
     */
    public MatrixElement[][] getElements() {
        return this.elements;
    }
    
    /**
     * Set the list of the elements of the matrix
     * @param elements the new list of the elements of the matrix
     */
    public void setElements(MatrixElement[][] elements) {
        this.elements = elements;
    }       
    
    /**
     * Get the element by its location
     * @param rowIndex - the row index of the element to found
     * @param columnIndex - the column index of the element to found
     * @return the matrix element
     */
    public MatrixElement getElement(int rowIndex, int columnIndex) {
        return this.elements[rowIndex][columnIndex];
    }
    
    /**
     * Set the elements value by its location
     * @param rowIndex - the row index of the element to be altered
     * @param columnIndex - the column index of the element to be altered
     * @param value - the new value of the element
     * @return the success of action
     */
    public boolean setElement(int rowIndex, int columnIndex, Number value) {
        boolean isSuccess = false;
        if((rowIndex <= this.rowCount) && (columnIndex <= this.columnCount)){
            this.elements[rowIndex][columnIndex] = new MatrixElement(rowIndex, columnIndex, value);
            isSuccess = true;
        }
        
        return isSuccess;
    }
    
    /**
     * Set the elements value
     * @param element - the element to be altered with new value
     * @return the success of action
     */
    public boolean setElement(MatrixElement element) {
        return this.setElement(element.getRowIndex(), element.getColumnIndex(), element.getValue());
    }
    
    /**
     * Set the elements value to zero by its location
     * @param rowIndex - the row index of the element to be altered
     * @param columnIndex - the column index of the element to be altered
     * @return the success of action
     */
    public boolean setZeroElement(int rowIndex, int columnIndex) {
        return this.setElement(rowIndex, columnIndex, 0);
    }
    
    /**
     * Set the elements value to zero
     * @param element - the element to be altered
     * @return the success of action
     */
    public boolean setZeroElement(MatrixElement element) {
        return this.setElement(element.getRowIndex(), element.getColumnIndex(), 0);
    }
}