package StateVsMemento.state;

public class TextEditor {
    private StringBuilder text = new StringBuilder();
    private EditorState state;

    public TextEditor() {
        this.state = new EditState(this);
    }

    public void setState(EditorState state){
        this.state = state;
    }

    public void type(String words){
        state.type(words);
    }

    public void appendText(String words){
        text.append(words);
    }

    public String getText(){
        return text.toString();
    }
}
