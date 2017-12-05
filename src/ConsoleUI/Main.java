/*
 * TODO
 * Move all the methods (except main) into sepparate static classes 
 */
package ConsoleUI;

import Helpers.Enums.OperationTypes;
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
            Printer.displayWelcomeMessage();
            Printer.displayPrimaryOptions();
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch(option) {
                case "1":
                    MainController.currentOperationType = OperationTypes.UNARY;
                    break;
                case "2":
                    MainController.currentOperationType = OperationTypes.BINARY;
                    break;
                default:
                    MainController.currentOperationType = OperationTypes.NONE;
                    break;
            }
            MainController.getInputs();
            MainController.executeOperation();
            
            if (MainController.toFinish()) { // Check if user does not wants to continue
                DefaultOptionUtil.execute("exit");
                break; // Break if user wants to stop
            }
            
            System.out.println("--------------------------------------------------");
        }
    }
}
