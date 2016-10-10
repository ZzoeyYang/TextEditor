package team.weird.compiler.editor.function;

public interface EditMenuItemFunc {
	void cutTextAction();
	void copyTextAction();
	void pasteTextAction();
	void undoTextAction();
	void redoTextAction();
	void selectAllAction();
	void deleteAction();
	void findAction();
	void replaceAction();
}
