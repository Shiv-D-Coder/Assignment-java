// Invoker class that executes commands
public class CommandInvoker {
    public void executeCommand(Command command) {
        command.execute(); // Delegates the action to the concrete command
    }
}