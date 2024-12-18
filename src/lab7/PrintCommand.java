package lab7;

/**
 * Команда для друку документа.
 */
public class PrintCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Друк документа...");
    }
}