// Demo for the Command pattern simulating a smart home
public class CommandPatternDemo {
    public static void main(String[] args) {
        CommandInvoker invoker = new CommandInvoker();

        // Simulating turning on the lights
        Command turnOnLights = new TurnOnLightsCommand();
        invoker.executeCommand(turnOnLights);

        // Simulating locking the doors
        Command lockDoors = new LockDoorsCommand();
        invoker.executeCommand(lockDoors);
    }
}
