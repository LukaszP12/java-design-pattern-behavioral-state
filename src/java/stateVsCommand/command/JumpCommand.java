package stateVsCommand.command;

class JumpCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Character jumps!");
    }
}
