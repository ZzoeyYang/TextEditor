package team.weird.compiler.editor.util;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

public class BrowserUtil extends JPanel {  
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BrowserUtil() {  
	    super(new BorderLayout());  
	    JPanel webBrowserPanel = new JPanel(new BorderLayout());  
	    webBrowserPanel.setBorder(BorderFactory.createTitledBorder("Native Web Browser component"));  
	    final JWebBrowser webBrowser = new JWebBrowser();  
	    webBrowser.navigate("http://www.baidu.com");  
	    webBrowserPanel.add(webBrowser, BorderLayout.CENTER);  
	    add(webBrowserPanel, BorderLayout.CENTER);  
	    // Create an additional bar allowing to show/hide the menu bar of the web browser.  
	    //JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 4));  
	    JCheckBox menuBarCheckBox = new JCheckBox("Menu Bar", webBrowser.isMenuBarVisible());  
	    menuBarCheckBox.addItemListener(new ItemListener() {  
	      public void itemStateChanged(ItemEvent e) {  
	        webBrowser.setMenuBarVisible(e.getStateChange() == ItemEvent.SELECTED);  
	      }  
	    });  
	    //buttonPanel.add(menuBarCheckBox);  
	    //add(buttonPanel, BorderLayout.SOUTH);  
	  }  
	  
	}  
