package StateVsMemento.memento;

public class MementoDemo {
    public static void main(String[] args) {
        EditorWithHistory editor = new EditorWithHistory();
        History history = new History();

        editor.type("Hello ");
        history.save(editor);
        editor.type("World!");
        System.out.println(editor.getText());

        history.undo(editor);
        System.out.println(editor.getText());
    }
}
