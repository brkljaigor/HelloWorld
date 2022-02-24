import java.awt.*;

import javax.swing.undo.StateEditable;

	class UndoableTextArea extends TextArea implements StateEditable{
		private final static String KEY_STATE="UndoableTextAreaKey";
		private boolean textChanged = false;
		private UndoManager undoManager;
		private StateEdit currentState;
	}

public class TextEditor {
	

}
