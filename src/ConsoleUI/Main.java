/*
 * TODO
 * Move all the methods (except main) into sepparate static classes 
 */
package ConsoleUI;

import Helpers.ResultEntities.ValueResult;
import java.util.Scanner;
/**
 *
 * @author AlekseyKachan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true) {
            displayWelcomeMessage();
            displayPrimaryOptions();
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch(option) {
                case "1":
                    processSingleMatrixInput();
                    enterMatrix();
                    Printer.printMatrix(MainController.matrix);
                    break;
                case "2":
                    processMultipleMatricesInput();

                    enterMatrix();
                    enterMatrix();
                    break;
                default:
                    processDefaultOption(option);
                    break;
            }
            displayTask();
            displayResult(null);
            
            if (toFinish()) { // Check if user does not wants to continue
                exitApplication();
                break; // Break if user wants to stop
            }
            
            System.out.println("--------------------------------------------------");
        }
    }
    
    private static boolean toFinish() {
        Scanner sc = new Scanner(System.in); //Initialize the instance of Scanner
        System.out.print("Continue (y/n)? "); // Ask user to continue
        String choice = sc.nextLine(); // Get users input
        return !choice.equalsIgnoreCase("y"); // Check if user does not wants to continue
    }
    
    private static void displayWelcomeMessage() {
        System.out.println("Welcome message. Content TBD");
    }
    
    private static void displayPrimaryOptions() {
        System.out.println("Select one of the following options:");
        System.out.println("1 - Single matrix operations");
        System.out.println("2 - Multiple matrices operations");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    private static void displaySingleMatrixOperations() {
        System.out.println("Select one of the following single matrix opertations:");
        System.out.println("1 - Elevate matrix");
        System.out.println("2 - Find determinant of the matrix");
        System.out.println("3 - Check if matrix is NOT degenerate matrix");
        System.out.println("4 - Find inverse matrix");
        System.out.println("5 - Find minor of matrix");
        System.out.println("6 - Find rank of matrix");
        System.out.println("7 - Decompose matrix");
        System.out.println("8 - Scalar multiplication");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    private static void displayMultipleMatricesOperations() {
        System.out.println("Select on of the following multiple matrices operations:");
        System.out.println("1 - Multiply matrices");
        System.out.println("2 - Divide matrices");
        System.out.println("3 - Add matrices");
        System.out.println("4 - Check if matrices are commutative (AB = BA)");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    private static void displayMatrixDecompositionOptions(){
        System.out.println("Select one of the following matrix decomposition options:");
        System.out.println("1 - LU decomposition");
        System.out.println("2 - QR decomposition");
        System.out.println("3 - Rank decomposition");
        System.out.println("4 - RRQ decomposition");
        System.out.println("5 - Cholesky decomposition");
        System.out.println("6 - Interpolate decomposition");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    private static void diplayMatrixCreationOptions(){
        System.out.println("Select the way matrix to be created:");
        System.out.println("1 - Enter size & each value");
        System.out.println("2 - Enter size & random [-99; 99] integer values");
        System.out.println("3 - Random [1; 5] & [-99; 99] integer size & values");
        System.out.println("Reset - to return to the beginning");
        System.out.println("Exit - to exit the application");
        System.out.print("Your option: ");
    }
    
    private static void displayEnterAmoutOfRows(){
        System.out.print("Enter the amout of rows: ");
    }
    
    private static void displayEnterAmoutOfColumns(){
        System.out.print("Enter the amout of columns: ");
    }
    
    private static void displayEnterValue(int rowNumber, int columnNumber){
        System.out.print("Enter the value of row " + rowNumber + " and column " + columnNumber + " element: ");
    }
    
    private static void displayTask() {
        System.out.println("The task to be solved. Content TBD");
    }
    
    private static void displayResult(ValueResult result) {
        System.out.println("Result of evaluations. Content TBD");
    }
    
    private static void processSingleMatrixInput() {
        Scanner sc = new Scanner(System.in);
        displaySingleMatrixOperations();
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
            case "7":
                processDecompositionInput();            
                break;
            case "8":
                break;
            default:
                processDefaultOption(option);
                break;
        }
    }
    
    private static void processDecompositionInput() {
        Scanner sc = new Scanner(System.in);
        displayMatrixDecompositionOptions();
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
                processDefaultOption(option);
                break;
        }
    }
    
    private static void processMultipleMatricesInput() {
        Scanner sc = new Scanner(System.in);
        displayMultipleMatricesOperations();
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
            default:
                processDefaultOption(option);
                break;
        }
    }
    
    private static void enterMatrix() {
        Scanner sc = new Scanner(System.in);
        diplayMatrixCreationOptions();
        String option = sc.nextLine();
        switch(option) {
            case "1":
                enterSizeValues();
                break;
            case "2":
                enterSize();
                break;
            case "3":
                break;
            default:
                processDefaultOption(option);
                break;
        }
    }
    
    private static void enterSizeValues() {
        Scanner sc = new Scanner(System.in);
        displayEnterAmoutOfRows();
        int rowsAmount = sc.nextInt();
        displayEnterAmoutOfColumns();
        int columnsAmount = sc.nextInt();
        MainController.setMatrix(rowsAmount, columnsAmount);
        for (int rowIndex = 0; rowIndex < rowsAmount; rowIndex++) {
            for (int columnIndex = 0; columnIndex < columnsAmount; columnIndex++) {
                displayEnterValue(rowIndex, columnIndex);
                int value = sc.nextInt();
                MainController.setElement(rowIndex, columnIndex, value);
                MainController.commitElement();
            }
        }
    }
    
    private static void enterSize() {
        Scanner sc = new Scanner(System.in);
        displayEnterAmoutOfRows();
        int rowsAmount = sc.nextInt();
        displayEnterAmoutOfColumns();
        int columnsAmount = sc.nextInt();
        MainController.setMatrix(rowsAmount, columnsAmount);
    }
    
    private static void processDefaultOption(String option) {
        switch(option.toLowerCase()){
            case "exit":
                exitApplication();
                break;
            case "reset":
                goBack();
                break;
            default:
                System.out.println("No such option");
                break;
        }
    }
    
    private static void exitApplication() {
        System.out.println("Thank you for using this application. Good bye!");
        System.exit(0);
    }
    
    private static void goBack() {
        System.out.flush();
    }
}
