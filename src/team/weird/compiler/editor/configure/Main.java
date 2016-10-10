package team.weird.compiler.editor.configure;

import java.io.IOException;

/**@project TextEditor
 * @filename Main.java
 * @author qian_yang
 * @description A C-MINUS compiler with simple but beautiful user interface.
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		LookAndFeel look = new LookAndFeel();
		look.initFrame();
	}

}
