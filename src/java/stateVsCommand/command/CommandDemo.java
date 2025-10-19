package stateVsCommand.command;

public class CommandDemo {
    public static void main(String[] args) {
        InputHandler controller = new InputHandler(
                new AttackCommand(),
                new JumpCommand()
        );

        controller.pressAttack();
        controller.pressJump();
    }
}
