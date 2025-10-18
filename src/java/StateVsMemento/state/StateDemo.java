package StateVsMemento.state;

public class StateDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello ");
        editor.setState(new ReadOnlyState());
        editor.type("World!");
        System.out.println("Final text: " + editor.getText());
    }
}
