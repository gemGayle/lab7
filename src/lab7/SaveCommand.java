package lab7;

/**
 * Команда для збереження документа.
 */
public class SaveCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Збереження документа...");
    }
}