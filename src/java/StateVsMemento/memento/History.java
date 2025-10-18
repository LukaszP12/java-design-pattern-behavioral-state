package StateVsMemento.memento;

import java.util.Stack;

public class History {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorWithHistory editor){
        history.push(editor.save());
    }

    public void undo(EditorWithHistory editor){
        if (!history.isEmpty()){
            editor.restore(history.pop());
        }
    }
}
