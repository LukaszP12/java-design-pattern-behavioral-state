package StateVsMemento.memento;

public class EditorWithHistory {
    private String text = "";

    public void type(String words){
        text += words;
    }

    public String getText(){
        return text;
    }

    public EditorMemento save(){
        return new EditorMemento(text);
    }

    public void restore(EditorMemento memento){
        this.text = memento.getSavedState();
    }
}
