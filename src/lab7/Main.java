package lab7;

/**
 * Головний клас для демонстрації виконання команд та макро-команд.
 */
public class Main {
    public static void main(String[] args) {
        // Створення конкретних команд
        Command save = new SaveCommand();
        Command print = new PrintCommand();
        Command close = new CloseCommand();

        // Виконання окремих команд
        System.out.println("Натиснення кнопки 'Save':");
        save.execute();

        System.out.println("\nНатиснення кнопки 'Print':");
        print.execute();

        // Створення макро-команди
        MacroCommand macro = new MacroCommand();
        macro.addCommand(save);
        macro.addCommand(print);
        macro.addCommand(close);

        System.out.println("\nВиконання макро-команди (Save + Print + Close):");
        macro.execute();
    }
}
