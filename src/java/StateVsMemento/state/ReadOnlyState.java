package StateVsMemento.state;

public class ReadOnlyState implements EditorState {
    @Override
    public void type(String words) {
        System.out.println("Cannot type in Read-Only mode.");
    }
}
