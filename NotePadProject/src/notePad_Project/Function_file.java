package notePad_Project;

public class Function_file {
	
	NotePad notepad;
	public Function_file(NotePad notepad) {
		this.notepad=notepad;
	}

	public void newFile() {
	
notepad.textArea.setText("");
notepad.frame.setTitle("New");
	
	}
}
