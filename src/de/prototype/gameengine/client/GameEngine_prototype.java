package de.prototype.gameengine.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.gwtext.client.widgets.form.FormPanel;
import com.gwtext.client.widgets.form.TextField;


public class GameEngine_prototype implements EntryPoint {

	public void onModuleLoad() {
		
		FormPanel panel = new FormPanel();
		TextField field = new TextField("test");
		field.setLabel("label");		
		field.setAllowBlank(false);
		panel.add(field);
		RootPanel.get().add(panel);
		
	}
}
