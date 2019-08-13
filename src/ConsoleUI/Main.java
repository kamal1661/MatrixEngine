/*
 * TODO
 * Move all the methods (except main) into sepparate static classes 
 */
package ConsoleUI;

/**
 * Main entity of the ConsoleUI
 * @author AlekseyKachan
 */
public class Main {

    /**
     * Displays system messages
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true) {
            MainController.executeMainRunner();
            
            if (MainController.toFinish()) { // Check if user does not wants to continue
                DefaultOptionUtil.execute("exit");
                break; // Break if user wants to stop
            }
            
            System.out.println("--------------------------------------------------");
        }
    }
}
