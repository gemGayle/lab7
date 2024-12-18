package lab7;

import java.util.ArrayList;
import java.util.List;

/**
 * Макро-команда для виконання послідовності команд.
 */
public class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    /**
     * Додає команду до макро-команди.
     *
     * @param command Команда для додавання.
     */
    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}