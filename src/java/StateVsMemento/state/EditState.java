package StateVsMemento.state;

public class EditState implements EditorState {
    private TextEditor editor;

    public EditState(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void type(String words) {
        editor.appendText(words);
        System.out.println("Typing: " + words);
    }
}
