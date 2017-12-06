/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConsoleUI;

/**
 *
 * @author AlekseyKachan
 */
public class DefaultOptionUtil {

    /**
     *
     * @param option
     */
    public static void execute(String option) {
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
