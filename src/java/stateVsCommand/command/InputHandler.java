package stateVsCommand.command;

class InputHandler {
    private Command attack;
    private Command jump;

    public InputHandler(Command attack, Command jump) {
        this.attack = attack;
        this.jump = jump;
    }

    public void pressAttack(){
        attack.execute();
    }

    public void pressJump(){
        jump.execute();
    }
}
