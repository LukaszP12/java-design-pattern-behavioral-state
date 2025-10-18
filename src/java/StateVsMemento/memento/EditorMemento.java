package StateVsMemento.memento;

public class EditorMemento {
    private final String state;

    public EditorMemento(String state) {
        this.state = state;
    }

    public String getSavedState(){
        return state;
    }
}
