package lab7;

/**
 * Команда для закриття документа.
 */
public class CloseCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Закриття документа...");
    }
}