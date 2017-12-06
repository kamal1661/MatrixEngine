/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

import Data.Matrix;
import Data.MatrixElement;
import Helpers.Enums.MatrixOperations;
import Helpers.Enums.OperationTypes;
import Helpers.ResultEntities.ValueResult;
import Helpers.Utils.ArrayUtil;
import MatrixWorkers.MatrixWorker;
import java.util.Scanner;

/**
 *@author AlekseyKachan
 * Entity that determines what type of operations are being performed at any given time.
 */
public class MainController {

    /**
     * operation that is being done at this time.
     */
    public static MatrixOperations currentOperation = MatrixOperations.NONE;

    /**
     *  what type of operation is going to be performed.
     */
    public static OperationTypes currentOperationType = OperationTypes.NONE;
        
    /**
     * Gets the input for what type of operation will be performed.
     */
    public static void getInputs() {
        
        switch(currentOperationType) {
            case UNARY:
                processSingleMatrixInput();
                break;
            case BINARY:
                processMultipleMatricesInput();
                break;
        }         
    }
    
    /**
     * Executes the choice of which operation to perform to a single matrix.
     */
    private static void processSingleMatrixInput() {
        MatrixWorker.initialize();
        Scanner sc = new Scanner(System.in);
        Printer.displaySingleMatrixOperations();
        String option = sc.nextLine();      
        switch(option) {
            case "1":
                currentOperation = MatrixOperations.ELEVATE_MATRIX;
                break;
            case "2":
                currentOperation = MatrixOperations.FIND_DETERMINANT;
                break;
            case "3":
                currentOperation = MatrixOperations.CHECK_NOT_DEGENERTE;
                break;
            case "4":
                currentOperation = MatrixOperations.FIND_INVERSE;
                break;
            case "5":
                currentOperation = MatrixOperations.FIND_MINOR;
                break;
            case "6":
                currentOperation = MatrixOperations.FIND_RANK;
                break;
            case "7":
                currentOperation = MatrixOperations.DECOMPOSE;
                processDecompositionInput();            
                break;
            case "8":
                currentOperation = MatrixOperations.SCALAR_MULTIPLICATION;
                MatrixWorker.addMatrix(MatrixCreator.createMatrix());
                MatrixWorker.addScalarValue(getScalarInput());
                break;
            case "9":
                currentOperation = MatrixOperations.GET_SUBMATRIX;
                break;
            default:
                currentOperation = MatrixOperations.NONE;
                DefaultOptionUtil.execute(option);
                break;
        }
    }
    
    /**
     * Gives the choice of which operation to perform to multiple matrices.
     */
    private static void processMultipleMatricesInput() {
        Scanner sc = new Scanner(System.in);
        Printer.displayMultipleMatricesOperations();
        String option = sc.nextLine();
        switch(option) {
            case "1":
                currentOperation = MatrixOperations.MULTIPLICATION;
                break;
            case "2":
                currentOperation = MatrixOperations.DIVISION;
                break;
            case "3":
                currentOperation = MatrixOperations.ADDITION;
                break;
            case "4":
                currentOperation = MatrixOperations.SUBSTRACTION;
                break;
            case "5":
                currentOperation = MatrixOperations.CHECK_COMMUTATIVE;
                break;
            default:
                currentOperation = MatrixOperations.NONE;
                DefaultOptionUtil.execute(option);
                break;
        }
    }
    
    /**
     * Displays the matrix decomposition options.
     */
    private static void processDecompositionInput() {
        Scanner sc = new Scanner(System.in);
        Printer.displayMatrixDecompositionOptions();
        String option = sc.nextLine();
        switch(option) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                DefaultOptionUtil.execute(option);
                break;
        }
    }
    
    /**
     * Executes the operations that were previously selected to be performed.
     */
    public static void executeOperation() {
        if (currentOperation != MatrixOperations.NONE) {
            for (Matrix matrix : MatrixWorker.getMatrices()) {
                if (matrix == null) {
                    break;
                }
                
                Printer.displayMatrix(matrix);
            }

            ValueResult result = MatrixWorker.executeOperation(currentOperation);
            Printer.displayMatrix((Matrix)result.getResult());
            Printer.displayTask(currentOperation);
            Printer.displayResult(null);
        }
    }
    
    /**
     * Returns results 
     * @return
     */
    public static boolean toFinish() {
        Scanner sc = new Scanner(System.in); //Initialize the instance of Scanner
        System.out.print("Continue (y/n)? "); // Ask user to continue
        String choice = sc.nextLine(); // Get users input
        return !choice.equalsIgnoreCase("y"); // Check if user does not wants to continue
    }

    private static Number getScalarInput() {
        Scanner sc = new Scanner(System.in); //Initialize the instance of Scanner
        System.out.print("Enter the scalar value: "); // Ask user to enter scalar value
        return sc.nextInt();
    }
}
