package stateVsCommand.command;

class AttackCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Character attacks!");
    }
}
